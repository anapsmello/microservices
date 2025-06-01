#!/bin/bash
set -euo pipefail

# Verifica se ao menos um diretório foi passado
if [ "$#" -eq 0 ]; then
  echo "Uso: $0 caminho/para/serviço1 [caminho/para/serviço2 ...]"
  exit 1
fi

for dir in "$@"; do
  abs_dir="/$dir"
  echo "🔧 Entrando em $abs_dir"

  if [ -d "$abs_dir" ]; then
    cd "$abs_dir"
    echo "🚀 Construindo imagem Docker com Maven: $(pwd)"
    mvn compile jib:dockerBuild
    echo "✅ Concluído: $abs_dir"
  else
    echo "❌ Diretório não encontrado: $abs_dir"
  fi
done
