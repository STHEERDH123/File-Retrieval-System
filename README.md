# File-Retrieval-System

Welcome to the File Retrieval System! This Java-based application allows you to index and search files within specified datasets. With its intuitive command-line interface and efficient processing engine, the File Retrieval System makes it easy to manage and retrieve information from your data collections. This README provides an overview of the File Retrieval System's features, components, and usage instructions.

## Key Features

- **Indexing:** Index files from specified dataset paths.
- **Searching:** Perform searches using AND queries to retrieve relevant files.
- **Sorting:** Sort search results based on term occurrence frequency.
- **Command-Line Interface:** Interact with the system using simple commands.
- **Graceful Shutdown:** Close the application seamlessly.

## Components Overview

### 1. AppInterface
The AppInterface component is responsible for providing a user-friendly command-line interface. It interprets user commands, forwards them to the ProcessingEngine, and displays the results on the screen.

### 2. ProcessingEngine
The ProcessingEngine manages indexing and search operations. During indexing, it extracts alphanumeric terms from dataset files and builds an index with term-document mappings. During searches, it retrieves relevant files based on the query terms and sorts the results by occurrence frequency.

### 3. IndexStore
The IndexStore component stores and manages the index data structure. It supports updating the index and performing single-term lookup operations efficiently.

## Usage Instructions

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the project using Maven: `mvn clean install`.
4. Run the application: `java -jar target/file-retrieval-system.jar`.

### Commands
- `index <dataset path>`: Index files from the specified dataset path.
- `search <AND query>`: Search for files containing all terms in the AND query.
- `quit`: Close the application gracefully.

## Dataset Support

The File Retrieval System supports indexing and searching files from the Gutenberg Project Datasets. These datasets contain ASCII TXT documents representing books, and they are available for evaluation purposes.

## Performance Evaluation

To evaluate indexing performance, run the program for each dataset and measure the wall time taken for indexing. Calculate the indexing throughput in MB/s by dividing the total dataset size by the total indexing execution time. The differences between wall time and CPU time, dataset sizes, data structures used in IndexStore, and the IO-intensive nature of the ProcessingEngine are discussed in detail in the evaluation section.
