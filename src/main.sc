require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    state: hello
        q!: *(прив*/здравствуй*/ку*)*
        a: Привет привет

    state: weather
        q!: *(погод*) *
        random:
            a: Погодка сегодня не очень
            a: Отличная погода на улице
            
    state: currency
        q: *(курс*) (валют*/доллар*/евро/йен*)*
        a: Я не располагаю подобной информацией

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

