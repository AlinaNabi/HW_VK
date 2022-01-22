package domain;

public class Post {
    private int idPost;             //Идентификатор записи.
    private int ownerId;            //Идентификатор владельца стены
    private int fromId;             // Идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy;          //Идентификатор администратора, который опубликовал запись
    private int date;               //Время публикации записи в формате unixtime
    private String text;            //текст записи
    private int replyOwnerId;       //Идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;        //Идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;        //если запись была создана с опцией «Только для друзей»
    private CommentsInfo commentsInfo; //класс с коментариями
    private Copyright copyright;    //Источник материала, объект
    private LikesPost likesPost;    //Информация о лайках к записи, объект
    private RepostsPost repostsPost; //Информация о репостах записи, объект
    private ViewsPost viewsPost;     //Информация о просмотрах записи
    private String postType;
    private PostSource postSource;
    private GeoPost geoPost;        //Информация о местоположении
    private int signerId;           //Идентификатор автора
    private int canPin;         //может ли текущий пользователь закрепить запись
    private int canDelete;      //может ли текущий пользователь удалить запись
    private int canEdit;        // может ли текущий пользователь редактировать запись
    private int isPinned;       //Информация о том, что запись закреплена
    private int markedAsAds;    //Информация о том, содержит ли запись отметку «реклама»
    private boolean isFavorite; // добавлен в закладки у текущего пользователя
    private Donut donut;        //Информация о записи VK Donut, объект



    // + get/set
}
