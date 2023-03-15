// # Task

// Provide 3 unique implementations of the following function.

// **Input**: `n` - any integer

// *Assuming this input will always produce a result lesser than `Number.MAX_SAFE_INTEGER`*.

// **Output**: `return` - summation to `n`, i.e. `sum_to_n(5) === 1 + 2 + 3 + 4 + 5 === 15`.


var sum_to_n_a = function(n) {
    // sum the values with for loop
        for(let i = 1; i <= n; i++) {
            s = s + i;
        } return s; };

var sum_to_n_b = function(n) {
    /* addition of first n natural number formula is given */
        if (n <= 1)
            return n;
        s = n + sum_to_n_b(n-1);
            return s;
        };

var sum_to_n_c = function(n) {
    /* using formula */
        let s = 0;
        s  = n * (n + 1) / 2;
        return s;
};

// 1. First function is done with for loop concept.
// 2. second function is done with recursion.
// 3. Third function is done with addition formula of first n natural numbers ( n*(n+1)/2)
