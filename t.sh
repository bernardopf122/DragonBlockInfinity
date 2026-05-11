#!/bin/bash

OUTPUT="arquivo.txt"
> "$OUTPUT"

echo "========================================" >> "$OUTPUT"
echo "ESTRUTURA DE PASTAS" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -not -path './.git/*' -not -path './build/*' -not -path './.gradle/*' -not -path './gradle/*' | sort >> "$OUTPUT"

echo "" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
echo "ARQUIVOS JAVA" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -name "*.java" -not -path './build/*' | sort | while read f; do
    echo "" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    echo "ARQUIVO: $f" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    cat "$f" >> "$OUTPUT"
done

echo "" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
echo "ARQUIVOS KOTLIN" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -name "*.kt" -not -path './build/*' | sort | while read f; do
    echo "" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    echo "ARQUIVO: $f" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    cat "$f" >> "$OUTPUT"
done

echo "" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
echo "ARQUIVOS JSON" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -name "*.json" -not -path './build/*' -not -path './.gradle/*' | sort | while read f; do
    echo "" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    echo "ARQUIVO: $f" >> "$OUTPUT"
    echo "----------------------------------------" >> "$OUTPUT"
    cat "$f" >> "$OUTPUT"
done

echo "" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
echo "ARQUIVOS PNG (apenas nome e caminho)" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -name "*.png" -not -path './build/*' | sort | while read f; do
    echo "$f" >> "$OUTPUT"
done

echo "" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
echo "ARQUIVOS OGG (apenas nome e caminho)" >> "$OUTPUT"
echo "========================================" >> "$OUTPUT"
find . -name "*.ogg" -not -path './build/*' | sort | while read f; do
    echo "$f" >> "$OUTPUT"
done

echo "arquivo.txt gerado!"
