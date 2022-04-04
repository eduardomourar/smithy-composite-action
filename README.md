# smithy-composite-action

GitHub composite action to run a basic build with the Smithy CLI.

## Usage

```yaml
on: [push]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - uses: eduardomourar/smithy-composite-action@v1
```
