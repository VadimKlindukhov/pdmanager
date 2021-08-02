# тестовое задание

### схема бд
Attempt |
--- |
id |
username |
fullName |
email |
dateOfBirth |
gender |
rawImage |


### rest endpoints

POST /persons
добавление нового person

    {
        username : string
        fullName : string
        email : string
        dateOfBirth : date string (yyyy-MM-dd)
        gender : MALE | FEMALE
        rawImage : string (image src)
    }


GET /persons
получение списка persons

    {
        id : number
        username : string
        fullName : string
    }


GET /persons/{personId}

personId : number

    {
        id : number
        username : string
        fullName : string
        email : string
        dateOfBirth : date string (yyyy-MM-dd)
        gender : MALE | FEMALE
        rawImage : string (image src)
    }

### приметки

требований для хранения картинок не предьявлено, так что решил хранить в виде строк

чтобы можно было запустить и проверить приложение без поднятого инстанса postgres использовал встраиваемую БД