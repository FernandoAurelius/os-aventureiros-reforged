# Validation checklist

## Build

- [ ] `java -version` mostra Java 21.
- [ ] `./gradlew clean build` passa.
- [ ] Jar e gerado em `build/libs`.
- [ ] Sem erro de registry ausente.
- [ ] Sem erro de resource/data pack invalido.

## Client

- [ ] `./gradlew runClient` abre menu.
- [ ] Mundo novo e criado.
- [ ] Creative tab aparece.
- [ ] Itens/blocos aparecem.
- [ ] EMI mostra receitas.
- [ ] Texturas/modelos nao ficam missing pink/black.

## Server

- [ ] `./gradlew runServer` sobe.
- [ ] Dedicated server abre sem crash.
- [ ] Cliente conecta.
- [ ] Sem erro fatal com Better Combat.
- [ ] Sem erro fatal com Spartan.

## Gameplay

- [ ] Tin ore gera em Overworld.
- [ ] Silver ore gera em Overworld.
- [ ] Adamantite ore e muito raro.
- [ ] Bronze pode ser craftado.
- [ ] Steel pode ser refinado.
- [ ] Silver vulnerable tag carrega.
- [ ] Orichalcum nao aparece facil cedo.

## Compat

- [ ] Better Combat fallback foi mesclado com backup.
- [ ] Spartan nao exige itens inexistentes sem tags.
- [ ] Warning de `c:ingots/aluminum` foi tratado ou documentado.
- [ ] Lootr continua funcional.

## Release

- [ ] Jar versionado.
- [ ] Changelog curto.
- [ ] Backup do servidor real.
- [ ] Teste em mundo separado.
- [ ] So entao colocar no servidor real.
