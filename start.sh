#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")"
export PATH="$HOME/java/bin:$PATH"
chmod +x run.sh 2>/dev/null || true
exec ./run.sh nogui
