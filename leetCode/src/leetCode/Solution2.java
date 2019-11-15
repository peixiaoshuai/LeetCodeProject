package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution2 {
	public static int[] shortestToChar(String S, char C) {
		int left = -1;
		int right = -1;
		int[] result = new int[S.length()];
		for (int i = 0; i < result.length; i++) {
			if(i>right){
				for (int j=i;j<result.length;j++){
					if(S.charAt(j)==C){
						left = right;
						right = j;
						break;
					}
				}
			}
			if(left==-1){
				result[i] = Math.abs(right-i);
			}else{
				result[i] = Math.abs(Math.min(right-i,i-left));
			}
		}
		return result;
	}
	public static int addDigits(int num) {
		if(num <= 9){
			return num;
		}else{
			while (num > 9) {
				int temp = num % 10;
				num = num / 10;
				num += temp;
			}
			return num;
		}

	}
	public static List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<String>();
		int[] ans = new int[26];
		for (char c : A[0].toCharArray()) {
			ans[c-'a']++;
		}
		for (int i = 1; i < A.length; i++) {
			int[] temp = new int[26];
			for (char c : A[i].toCharArray()) {
				temp[c-'a']++;
			}
			for (int j = 0; j < 26; j++) {
				ans[j] =Math.min(ans[j], temp[j]);
			}
		}
		for (int i = 0; i < ans.length; i++) {
			if(ans[i] > 0){
				for (int j = 0; j < ans[i]; j++) {
					result.add(String.valueOf((char)(i +'a')));
				}
			}
		}
		return result;
	}
	public static int calPoints(String[] ops) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (String s : ops) {
			if(s.equals("+")){
				int top = stack.pop();
				int newTop = top+stack.peek();
				stack.push(top);
				stack.push(newTop);
			}else if(s.equals("C")){
				stack.pop();
			}else if(s.equals("D")){
				int newTop = stack.peek();
				stack.push(newTop * 2);
			}else{
				stack.push(Integer.valueOf(s));	
			}
		}
		for (Integer integer : stack) {
			result += integer;
		}
		return result;
	}
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows == 0){
			return result;
		}
		List<Integer> one = new ArrayList<Integer>();
		one.add(1);
		result.add(one);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			if(i == 2){
				temp.add(1);
				temp.add(1);
				result.add(temp);
				one = temp;
			}else{
				for (int j = 0; j < i; j++) {
					if(j == i-1){
						temp.add(1);
					}else if(j == 0){
						temp.add(1);
					}else{
						temp.add(one.get(j) + one.get(j-1));
					}
				}
				result.add(temp);
				one = temp;
			}

		}
		return result;
	}
	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String,Integer> map = new HashMap<>();
		for (String cpdomain :cpdomains) {
			//先获取最低一级域名访问的次数
			int number = Integer.valueOf(cpdomain.substring(0,cpdomain.indexOf(" ")));
			//获取最低一级域名
			String s = cpdomain.substring(cpdomain.indexOf(" ")+1, cpdomain.length());
			//将最低域名存入map集合，注意：该域名类似“lmm.ca”，而之前有域名格式为“yaw.lmm.ca”,要注意统计访问次数
			if(map.containsKey(s)){
				int newNumber = map.get(s)+ number;
				map.put(s, newNumber);
			}else{
				map.put(s, number);
			}
			char[] cs = s.toCharArray();
			for (int i = cs.length -1; i > 0; i--) {
				if(cs[i] == '.'){
					String key = s.substring(i+1, s.length());
					if(map.containsKey(key)){
						int newNumber = map.get(key)+ number;
						map.put(key, newNumber);
					}else{
						map.put(key, number);
					}
				}
			}
		}
		List<String> list = new ArrayList<String>();
		for (String key : map.keySet()) {
			String  result = map.get(key) +" "+ key;
			list.add(result);
		}
		return list;
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		while(current != null){
			ListNode nextTemp = current.next;
			current.next = previous;
			previous = current;
			current = nextTemp;
		}
		return previous;
	}
	public static String[] findOcurrences(String text, String first, String second) {
		String[] texts = text.split(" ");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < texts.length -1; i++) {
			if(texts[i].equals(second) && i != 0){
				if(texts[i-1].equals(first)){
					list.add(texts[i+1]);
				}
			}
		}
		return list.toArray(new String[list.size()]);
	}
	private static String[] map = {
		".-",
		"-...",
		"-.-.",
		"-..",
		".",
		"..-.",
		"--.",
		"....",
		"..",
		".---",
		"-.-",
		".-..",
		"--",
		"-.",
		"---",
		".--.",
		"--.-",
		".-.",
		"...",
		"-",
		"..-",
		"...-",
		".--",
		"-..-",
		"-.--",
		"--.."
	};
	public static int numJewelsInStones(String J, String S) {
		int result = 0;
		char[] j = J.toCharArray();
		char[] s = S.toCharArray();
		for (int i = 0; i < j.length; i++) {
			for (int k = 0; k < s.length; k++) {
				if(j[i] == s[k]){
					result++;
				}
			}
		}
		return result;
	}
	public static String removeOuterParentheses(String S) {
		char[] s = S.toCharArray();
		int mark = 0;
		int beginIndex = 0;
		int endIndex = 0;
		String reslut = "";
		for (int i = 0; i < s.length; i++) {
			if("(".equals(s[i])){
				mark++;
				if(mark == 0){
					beginIndex = i;
					continue;
				}
			}
			if(")".equals(s[i])){
				mark--;
			}
			if(mark == 0){
				endIndex = i;
				String res = S.substring(beginIndex+1, endIndex-1);
				reslut += res;
				beginIndex = 0;
				endIndex = 0;
			}
		}
		return reslut;
	}
	public static int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for(int start = 0, end = A[i].length -1; start < end; start++,end--){
				int temp = A[i][start];
				A[i][start] = A[i][end];
				A[i][end] = temp;
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = A[i][j] == 0 ? 1:0;
			}
		}
		return A;
	}
	public static int uniqueMorseRepresentations(String[] words) {
		if(words == null){
			return 0;
		}
		HashSet<String> set = new HashSet<>();
		for(String s : words){
			StringBuffer buffer = new StringBuffer();
			for (char c : s.toCharArray()) {
				buffer.append(map[c-'a']);
			}
			set.add(buffer.toString());
		}
		System.err.println(set);
		return set.size();
	}
	public static boolean judgeCircle(String moves) {
		if(moves == null){
			return true;
		}
		char[] move = moves.toCharArray();
		int x = 0;
		int y = 0;
		for (int i = 0; i < move.length; i++) {
			if(move[i] == 'U'){
				y++;
			}else if(move[i] == 'D'){
				y--;
			}else if(move[i] == 'R'){
				x++;
			}else if(move[i] == 'L'){
				x--;
			}else{
				continue;
			}
		}
		if(x == 0 && y == 0){
			return true;
		}else{
			return false;
		}
	}
	public static int hammingDistance(int x, int y) {
		String xStr = Integer.toBinaryString(x);
		String yStr = Integer.toBinaryString(y);
		int reslut = 0;
		if(xStr.length() != yStr.length()){
			throw new IllegalArgumentException("输入数据有误！");
		}
		System.err.println(xStr+"******"+yStr);
		for (int i = 0; i < yStr.length(); i++) {
			if(yStr.charAt(i) == xStr.charAt(i)){
				reslut++;
			}
		}
		return reslut;
	}
	public static int heightChecker(int[] heights) {
		int result = 0;
		int[] copyHeigths = Arrays.copyOf(heights, heights.length);
		Arrays.sort(copyHeigths);
		for (int i = 0; i < copyHeigths.length; i++) {
			if(copyHeigths[i] != heights[i]){
				result++;
			}
		}
		return result;
	}
	public static int[] diStringMatch(String S) {
		int[] a = new int[S.length()+1];
		int min = 0;
		int max = S.length();
		char[] s = S.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if(s[i]== 'I'){
				a[i] = min;
				min++;
			}else{
				a[i] =max;
				max--;
			}
		}
		a[S.length()] = max;
		return a;
	}
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			String leftStr = i+"";
			boolean flag = false;
			for (int j = 0; j < leftStr.length(); j++) {
				int temp = Integer.valueOf((String) leftStr.substring(j, j+1));
				if(temp != 0 && i % temp == 0){
					flag =true;
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				result.add(i);
			}
		}
		return result;
	}
	public static int peakIndexInMountainArray(int[] A) {
		if (A == null || A.length < 3)  {
			return 0;
		}

		int max = Integer.MIN_VALUE;
		int ans = 0;

		for (int i = 0;i < A.length;i++) {
			if (A[i] > max) {
				max = A[i];
				ans = i;
			}
		}

		return ans;
	}
	public static int[] sortArrayByParity(int[] A) {
		int[] a = new int[A.length];
		int j = 0;
		int k = A.length-1;
		for (int i = 0; i < A.length; i++) {
			if(A[i] % 2 != 0){
				a[k] = A[i];
				k--;
			}else{
				a[j] = A[i];
				j++;
			}
		}
		return a;

	}
	public static void reverseString(char[] s) {
		for (int i = 0; i < s.length /2; i++) {
			char temp = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-1-i] = temp;
		}
		System.err.println(Arrays.toString(s));
	}
	public int[] sortedSquares(int[] A) {
		int[] a = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int x = A[i]*A[i];
			a[i]=x;
		}
		Arrays.sort(a);
		return a;
	}
	public static String[] findWords(String[] words) {
		List<Character> one = Arrays.asList('q','w','e','r','t','y','u','u','i','o');
		List<Character> two = Arrays.asList('a','s','d','f','g','h','j','k','l');
		List<Character> three = Arrays.asList('z','x','c','v','b','n','m');
		List<String> result =new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			List<Character> compareList = new ArrayList<Character>();
			String str = words[i].toLowerCase();
			char[] cs = str.toCharArray();
			for (int j = 0; j < cs.length; j++) {
				compareList.add(cs[j]);
			}
			if(one.containsAll(compareList) || two.containsAll(compareList) || three.containsAll(compareList)){
				result.add(words[i]);
			}
		}
		return result.toArray(new String[result.size()]);
	}
	public static int repeatedNTimes(int[] A) {
		int result = 0;
		int N = A.length / 2;
		/*for (int i = 0; i < A.length; i++) {
			int index = 0;
			for (int j = 0; j < A.length; j++) {
				if(A[i] == A[j]){
					index++;
				}
			}
			if(index == N){
				result = A[i];
				break;
			}
		}*/
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if(set.contains(A[i])){
				result =A[i];
			}else{
				set.add(A[i]);
			}
		}
		return result;
	}
	public static int numUniqueEmails(String[] emails) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			int s = emails[i].indexOf("+");
			if(s != -1){
				int t = emails[i].indexOf("@");
				String str1 = emails[i].substring(t, emails[i].length());
				String str2 = emails[i].substring(0, s);
				String result = str2.replace(".", "") + str1;
				set.add(result);
			}else{
				int t = emails[i].indexOf("@");
				String str1 = emails[i].substring(t, emails[i].length());
				String str2 = emails[i].substring(0, t);
				String result = str2.replace(".", "") + str1;
				set.add(result);
			}
		}
		return set.size();
	}
	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		if(nums.length <= 2){
			result = nums[0];
		}else{
			for (int i = 0; i < nums.length; i=i+2) {
				result += nums[i];   
			}
		}
		return result;
	}
	public static String reverseWords(String s) {
		String[] strs = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			StringBuilder builder = new StringBuilder(strs[i]);
			result.append(builder.reverse());
			if(i != strs.length - 1){
				result.append(" ");
			}
		}
		return result.toString();

	}
	public static int numRookCaptures(char[][] board) {
		int count = 0;
		//先确定‘R’的位置
		int x =0;
		int y =0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 'R'){
					x = i;
					y = j;
					break;
				}
			}
		}
		//向上移动
		for (int i = x-1; i > 0; i--) {
			if(board[i][y] == 'B'){
				break;
			}
			if(board[i][y] == 'p'){
				count++;
				break;
			}
		}
		//向下移动
		for (int i = x+1; i < board.length; i++) {
			if(board[i][y] == 'B'){
				break;
			}
			if(board[i][y] == 'p'){
				count++;
				break;
			}
		}
		//向左移动
		for (int i = y-1; i > 0; i--) {
			if(board[x][i] == 'B'){
				break;
			}
			if(board[x][i] == 'p'){
				count++;
				break;
			}
		}
		//向右移动
		for (int i = y+1; i < board.length; i++) {
			if(board[x][i] == 'B'){
				break;
			}
			if(board[x][i] == 'p'){
				count++;
				break;
			}
		}
		return count;

	}
	public static int minDeletionSize(String[] A) {
		int result = 0;
		int rowLen  = A.length;
		if(rowLen <= 0){
			return 0;
		}
		int colLen = A[0].length();
		char[][] cs = new char[colLen][rowLen];
		for (int i = 0; i < A.length; i++) {
			char[] acs = A[i].toCharArray();
			for (int j = 0; j < acs.length; j++) {
				cs[j][i] = acs[j];
			}
		}
		for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < cs[i].length -1; j++) {
				if(cs[i][j]> cs[i][j+1]){
					result++;
					break;
				}
			}
		}
		return result;
	}
	public static int[][] transpose(int[][] A) {
		int rowLen = A.length;
		int curLen = A[0].length;
		int[][] result = new int[curLen][rowLen];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				result[j][i] = A[i][j];
			}
		}
		return result;
	}
	public static int[] sortArrayByParityII(int[] A) {
		int j = 1;
		for (int i = 0; i < A.length; i = i+2) {
			if(A[i] % 2 != 0){
				while (A[j] % 2 != 0) {
					j = j+2;
				}
			}
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			/*if(A[i] % 2 != 0){
				a[k] = A[i];
				k = k+2;
			}else{
				a[j] = A[i];
				j = j+2;
			}*/
		}
		return A;
	}
	public static int singleNumber(int[] nums) {
		int ans = nums[0];
		if(nums.length > 1){
			for (int i = 1; i < nums.length; i++) {
				ans = ans ^ nums[i];
			}
		}
		return ans;
	}
	public static int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < candies.length; i++) {
			set.add(candies[i]);
		}
		if(set.size() >= candies.length / 2){
			return candies.length / 2;
		}else{
			return set.size();
		}
	}
	public static int[] numberOfLines(int[] widths, String S) {
		char [] cs = S.toCharArray();
		int index = 0;//行数
		int units = 0;//最后一行输入的单位
		for (int i = 0; i < cs.length; i++) {
			//若当前单位大于100，或者当前行剩余的单位不够书写当前字母，则另起一行
			if(units >= 100 || (100-units < widths[cs[i] - 'a'] )){
				index++;
				units = 0;
				units += widths[cs[i] - 'a'];
			}else{
				units += widths[cs[i] - 'a'];
			}
		}
		int[] reust = new int[2];
		//最后书写的字符，也需要记录一行
		if(units == 0){
			reust[0] = index;
		}else{
			reust[0] = index + 1;
		}
		reust[1] = units;
		return reust;
	}
	public static int[] distributeCandies(int candies, int num_people) {
		int[] result = new int[num_people];
		int candie = 0;
		while(candies > 0){
			for (int i = 0; i < result.length; i++) {
				if(candies >= candie+1){
					candie = candie+1;
					result[i] = result[i] + candie;
					candies -= candie;
				}else{
					result[i] = result[i] + candies;
					candies = 0;
				}

			}
		}
		return result;
	}
	public static String defangIPaddr(String address) {
		return address = address.replaceAll("\\.", "[.]");
	}
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums.length * nums[0].length  != r * c){
			return nums;
		}
		int[][] result = new int[r][c];
		int[] arr = new int[nums.length * nums[0].length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				arr[index] = nums[i][j];
				index++;
			}
		}
		int index2 = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = arr[index2];
				index2++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] nums = {{1,2,3},{4,5,6}};
		int[][] result = matrixReshape(nums,3,2);
		for (int i = 0; i < result.length; i++) {
			System.err.println(Arrays.toString(result[i]));
		}

	}

}
