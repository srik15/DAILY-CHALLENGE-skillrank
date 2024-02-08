// 279. Perfect Squares
// Given an integer n, return the least number of perfect square numbers that sum to n.
// A perfect square is an integer that is the square of an integer.

// Input: n = 12
// Output: 3
// Explanation: 12 = 4 + 4 + 4.

// Legendre's 3-Square Theorem
// If it's perfect square, return 1
// If it satisfies 4^a (8b + 7), return 4
// If it's sum of 2 perfect squares, return 2
// Otherwise, return 3
// Time complexity: O(sqrt(N))
// Space complexity: O(1)
	
public int numSquares(int n) {
	int sqrt = (int) Math.sqrt(n);

	if (sqrt * sqrt == n) // Perfect square
		return 1;

	while (n % 4 == 0) // 4^a (8b + 7)
		n = n / 4;

	if (n % 8 == 7)
		return 4;

	for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
		int square = i * i;
		int base = (int) Math.sqrt(n - square);

		if (base * base == n - square)
			return 2;
	}

	return 3;
}
