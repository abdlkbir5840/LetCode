#!/bin/bash

prod_env_dir="/Users/Apple/IdeaProjects/LetCode"  # Use the absolute path to LetCode

for dir in "$prod_env_dir"/*; do
    if [ -d "$dir" ]; then
        echo "Processing directory: $dir"
        # Remove .git and .gitignore within each subdirectory
        rm -rf "$dir/.git"
        rm -rf "$dir/.gitignore"
        echo "Completed $dir"
    fi
done

echo "Script completed."
