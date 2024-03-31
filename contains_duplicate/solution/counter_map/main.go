package main

import "fmt"

func containsDuplicate(nums []int) bool {
	counter := make(map[int]int)
	for _, num := range nums {
		counter[num]++
		if counter[num] > 1 {
			return true
		}
	}

	return false
}

func main() {
	isDuplicate := containsDuplicate([]int{1, 2, 3, 4, 1})
	fmt.Println(isDuplicate)
}
