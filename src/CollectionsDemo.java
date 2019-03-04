import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		CollectionsDemo collectionsDemo = new CollectionsDemo();

		//// Create Arraylist of Colors////
		collectionsDemo.createArraylist();
	}

	private void createArraylist() {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Black");
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Yellow");
		System.out.println("colorList::" + colorList);
		//// Iterate through colorList///////
		iterateColorlist(colorList);
	}

	private void iterateColorlist(ArrayList<String> colorList) {
		for (String color : colorList) {
			System.out.println("Color::" + color);
		}
		//// Insert element at first index////
		insertElementInList(colorList);
	}

	private void insertElementInList(ArrayList<String> colorList) {
		colorList.add(0, "White");
		System.out.println("colorList after adding element at first position::" + colorList);
		/// Get Element from List at specific index//////
		getElementFromList(colorList);
	}

	private void getElementFromList(ArrayList<String> colorList) {
		String colorVal = colorList.get(2);
		System.out.println("colorVal::" + colorVal);
		///// Update specific element in list/////
		updateElementInList(colorList);
	}

	private void updateElementInList(ArrayList<String> colorList) {
		colorList.set(4, "Purple");
		System.out.println("colorList after updating::" + colorList);
		//////// remove Element from List////
		removeElement(colorList);
	}

	private void removeElement(ArrayList<String> colorList) {
		colorList.remove(3);
		System.out.println("colorList after removing element::" + colorList);
		//// Search element in list////
		searchElement(colorList);
	}

	private void searchElement(ArrayList<String> colorList) {
		if (colorList.contains("Purple")) {
			System.out.println("Color Found!!");
		} else {
			System.out.println("There is no such color.");
		}
		//// Sort List/////
		sortColorList(colorList);
	}

	private void sortColorList(ArrayList<String> colorList) {
		Collections.sort(colorList);
		System.out.println("colorList after sorting::" + colorList);
		//// copy one list to other///
		copyColorList(colorList);
	}

	private void copyColorList(ArrayList<String> colorList) {
		ArrayList<String> monthList = new ArrayList<String>();
		monthList.add("Jan");
		monthList.add("Feb");
		monthList.add("Mar");
		monthList.add("Apr");
		monthList.add("May");
		System.out.println("monthList before copy::" + monthList);
		Collections.copy(monthList, colorList);
		System.out.println("monthList after copy::" + monthList);
		/// reverse elemnts in List///
		reverseElements(colorList);
	}

	private void reverseElements(ArrayList<String> colorList) {
		System.out.println("colorList before reverse::" + colorList);
		Collections.reverse(colorList);
		System.out.println("colorList after reverse::" + colorList);
		//// Retrive portion of list/////
		retrievePortionOfList(colorList);

	}

	private void retrievePortionOfList(ArrayList<String> colorList) {
		List<String> subList = colorList.subList(0, 3);
		System.out.println("subList::" + subList);
		//// Compare two Arraylists////
		compareList(colorList);
	}

	private void compareList(ArrayList<String> colorList) {
		ArrayList<String> newColorList = new ArrayList<String>();
		newColorList.add("White");
		newColorList.add("Red");
		newColorList.add("Neon");
		newColorList.add("Black");
		// Storing the comparison output in ArrayList<String>
		ArrayList<String> resultList = new ArrayList<String>();
		for (String color : colorList)
			resultList.add(newColorList.contains(color) ? "Yes" : "No");
		System.out.println("Comparison Result::" + resultList);
		///// increase size of arraylist///
		increaseSizeOfArraylist(colorList);
	}

	private void increaseSizeOfArraylist(ArrayList<String> colorList) {
		ArrayList<String> befList = new ArrayList<String>(3);
		befList.add("Sun");
		befList.add("Mon");
		befList.add("Tues");
		System.out.println("Before array list: " + befList);
		// Increase capacity to 6
		befList.ensureCapacity(6);
		befList.add("Wed");
		befList.add("Thurs");
		befList.add("Fri");
		System.out.println("After array list: " + befList);
		//// Replace second element of List///
		replaceSecondElement(colorList);
	}

	private void replaceSecondElement(ArrayList<String> colorList) {
		System.out.println("colorList before replace::" + colorList);
		colorList.set(1, "Pink");
		System.out.println("colorList after replace::" + colorList);
		//// Print Elements of
		printElements(colorList);
	}

	private void printElements(ArrayList<String> colorList) {
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println("Color::" + colorList.get(i));
		}
	}

}
