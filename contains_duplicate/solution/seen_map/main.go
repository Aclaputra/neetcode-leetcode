package main

import "fmt"

func containsDuplicate(nums []int) bool {
	seen := make(map[int]struct{})
	for _, num := range nums {
		if _, ok := seen[num]; ok {
			return true
		}
		seen[num] = struct{}{}
	}
	return false
}

func main() {
	isDuplicate := containsDuplicate([]int{1, 2, 3, 4, 1})
	fmt.Println(isDuplicate)
}
