# ccwc - Coding Challenges Word Counter

The `ccwc` (Coding Challenges Word Counter) is a simple Java program that counts various statistics of a text file based on command line options.

## Usage

```bash
java CCWC [-c | -l | -w] <file_path>
```
-c: Count the number of bytes in the file.
-l: Count the number of lines in the file.
-w: Count the number of words in the file.

Replace <file_path> with the actual path of the file you want to analyze.

## Examples
#### Count bytes in a file:
```bash
java CCWC -c your_file_path.txt
```
#### CCount lines in a file:
```bash
java CCWC -l your_file_path.txt
```
#### Count words in a file:
```bash
java CCWC -w your_file_path.txt
```

#### Count all (bytes, lines, and words) in a file:
```bash
java CCWC your_file_path.txt
```