require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    
    state: Start
        q!: $regex</start>
        a: Начнём.
        
    state: hello
        q!: *(прив*/здравствуй*)*
        a: Привет привет

    state: weather
        q!: *(погод*/дожд*/солнц*) *
        random:
            a: Погодка сегодня не очень
            a: Отличная погода на улице
            
    state: currency
        q: *(курс*/~стоить) *(валют*/доллар*/евро/йен*)*
        a: Я не располагаю подобной информацией

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

