package com.game.repository;

import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface PlayersRepository extends PagingAndSortingRepository<Player, Long>, JpaSpecificationExecutor<Player> {
//    private final List<Player> allPlayers = new ArrayList<>();
//
//    public PlayersRepository() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        try {
//            allPlayers.add(new Player(1L, "Ниус", "Приходящий Без Шума", Race.HOBBIT, Profession.ROGUE, sdf.parse("2010-10-12").getTime(), false, 58347, 33, 1153));
//            allPlayers.add(new Player(2L, "Никрашш", "НайтВульф", Race.ORC, Profession.WARLOCK, sdf.parse("2010-02-14").getTime(), false, 174403, 58, 2597));
//            allPlayers.add(new Player(3L, "Эззэссэль", "шипящая", Race.DWARF, Profession.CLERIC, sdf.parse("2006-02-28").getTime(), true, 804, 3, 196));
//            allPlayers.add(new Player(4L, "Бэлан", "Тсе Раа", Race.DWARF, Profession.ROGUE, sdf.parse("2008-02-25").getTime(), true, 44553, 29, 1947));
//            allPlayers.add(new Player(5L, "Элеонора", "Бабушка", Race.HUMAN, Profession.SORCERER, sdf.parse("2006-01-07").getTime(), true, 63986, 35, 2614));
//            allPlayers.add(new Player(6L, "Эман", "Ухастый Летун", Race.ELF, Profession.SORCERER, sdf.parse("2004-06-21").getTime(), false, 163743, 56, 1557));
//            allPlayers.add(new Player(7L, "Талан", "Рожденный в Бронксе", Race.GIANT, Profession.ROGUE, sdf.parse("2005-05-15").getTime(), false, 68950, 36, 1350));
//            allPlayers.add(new Player(8L, "Арилан", "Благотворитель", Race.ELF, Profession.SORCERER, sdf.parse("2006-08-10").getTime(), false, 61023, 34, 1977));
//            allPlayers.add(new Player(9L, "Деракт", "Эльфёнок Красное Ухо", Race.ELF, Profession.ROGUE, sdf.parse("2010-06-22").getTime(), false, 156630, 55, 2970));
//            allPlayers.add(new Player(10L, "Архилл", "Смертоносный", Race.GIANT, Profession.PALADIN, sdf.parse("2005-01-12").getTime(), false, 76010, 38, 1990));
//            allPlayers.add(new Player(11L, "Эндарион", "Маленький эльфенок", Race.ELF, Profession.DRUID, sdf.parse("2001-04-24").getTime(), false, 103734, 45, 4366));
//            allPlayers.add(new Player(12L, "Фаэрвин", "Темный Идеолог", Race.HUMAN, Profession.NAZGUL, sdf.parse("2010-09-06").getTime(), false, 7903, 12, 1197));
//            allPlayers.add(new Player(13L, "Харидин", "Бедуин", Race.TROLL, Profession.WARRIOR, sdf.parse("2009-09-08").getTime(), false, 114088, 47, 3512));
//            allPlayers.add(new Player(14L, "Джур", "БоРец с жАжДой", Race.ORC, Profession.DRUID, sdf.parse("2009-07-14").getTime(), false, 29573, 23, 427));
//            allPlayers.add(new Player(15L, "Грон", "Воин обреченный на бой", Race.GIANT, Profession.PALADIN, sdf.parse("2005-04-28").getTime(), false, 174414, 58, 2586));
//            allPlayers.add(new Player(16L, "Морвиел", "Копье Калимы", Race.ELF, Profession.CLERIC, sdf.parse("2010-03-15").getTime(), false, 49872, 31, 2928));
//            allPlayers.add(new Player(17L, "Ннуфис", "ДиамантоваЯ", Race.HUMAN, Profession.ROGUE, sdf.parse("2001-09-03").getTime(), false, 162477, 56, 2823));
//            allPlayers.add(new Player(18L, "Ырх", "Троль гнет ель", Race.TROLL, Profession.WARRIOR, sdf.parse("2001-04-08").getTime(), true, 136860, 51, 940));
//            allPlayers.add(new Player(19L, "Блэйк", "Серый Воин", Race.HUMAN, Profession.ROGUE, sdf.parse("2005-05-23").getTime(), false, 151039, 54, 2961));
//            allPlayers.add(new Player(20L, "Нэсс", "Бусинка", Race.TROLL, Profession.WARRIOR, sdf.parse("2008-02-09").getTime(), true, 64945, 35, 1655));
//            allPlayers.add(new Player(21L, "Ферин", "Воитель", Race.TROLL, Profession.WARRIOR, sdf.parse("2003-07-08").getTime(), false, 120006, 48, 2494));
//            allPlayers.add(new Player(22L, "Солках", "Ученик Магии", Race.ELF, Profession.SORCERER, sdf.parse("2001-11-07").getTime(), false, 152996, 54, 1004));
//            allPlayers.add(new Player(23L, "Сцинк", "Титан Войны", Race.GIANT, Profession.WARRIOR, sdf.parse("2008-01-04").getTime(), true, 86585, 41, 3715));
//            allPlayers.add(new Player(24L, "Айша", "Искусительница", Race.HUMAN, Profession.CLERIC, sdf.parse("2010-01-25").getTime(), false, 106181, 45, 1919));
//            allPlayers.add(new Player(25L, "Тант", "Черт закAтай вату", Race.DWARF, Profession.PALADIN, sdf.parse("2010-10-03").getTime(), false, 33889, 25, 1211));
//            allPlayers.add(new Player(26L, "Трениган", "Великий Волшебник", Race.ELF, Profession.SORCERER, sdf.parse("2004-05-17").getTime(), false, 91676, 42, 2924));
//            allPlayers.add(new Player(27L, "Вуджер", "Печальный", Race.TROLL, Profession.NAZGUL, sdf.parse("2010-10-04").getTime(), false, 93079, 42, 1521));
//            allPlayers.add(new Player(28L, "Камираж", "БAнкир", Race.DWARF, Profession.CLERIC, sdf.parse("2005-08-05").getTime(), true, 79884, 39, 2116));
//            allPlayers.add(new Player(29L, "Ларкин", "СвЯтой", Race.HOBBIT, Profession.CLERIC, sdf.parse("2003-07-10").getTime(), false, 111868, 46, 932));
//            allPlayers.add(new Player(30L, "Зандир", "Темновидец", Race.ELF, Profession.WARLOCK, sdf.parse("2003-05-24").getTime(), false, 29654, 23, 346));
//            allPlayers.add(new Player(31L, "Балгор", "пещерный Урук", Race.ORC, Profession.NAZGUL, sdf.parse("2005-02-23").getTime(), false, 18869, 18, 131));
//            allPlayers.add(new Player(32L, "Регарн", "Любитель ОЛивье", Race.GIANT, Profession.WARRIOR, sdf.parse("2006-12-23").getTime(), false, 144878, 53, 3622));
//            allPlayers.add(new Player(33L, "Анжелли", "Молодой Боец", Race.DWARF, Profession.WARRIOR, sdf.parse("2010-04-08").getTime(), false, 59281, 33, 219));
//            allPlayers.add(new Player(34L, "Джерис", "Имперский Воин", Race.ORC, Profession.WARRIOR, sdf.parse("2001-05-12").getTime(), false, 173807, 58, 3193));
//            allPlayers.add(new Player(35L, "Жэкс", "Ярочкино Солнышко", Race.GIANT, Profession.WARRIOR, sdf.parse("2008-01-04").getTime(), false, 848, 3, 152));
//            allPlayers.add(new Player(36L, "Филуэль", "Химик и Карпускулярник.", Race.ELF, Profession.WARLOCK, sdf.parse("2008-08-03").getTime(), false, 48496, 30, 1104));
//            allPlayers.add(new Player(37L, "Яра", "Прельстивая", Race.HUMAN, Profession.CLERIC, sdf.parse("2004-06-12").getTime(), false, 138306, 52, 4794));
//            allPlayers.add(new Player(38L, "Иллинас", "Иероглиф", Race.HOBBIT, Profession.WARRIOR, sdf.parse("2007-06-03").getTime(), false, 115546, 47, 2054));
//            allPlayers.add(new Player(39L, "Ардонг", "Вспышк A", Race.HUMAN, Profession.WARLOCK, sdf.parse("2009-09-16").getTime(), false, 24984, 21, 316));
//            allPlayers.add(new Player(40L, "Аттирис", "и.о.Карвандоса", Race.ELF, Profession.SORCERER, sdf.parse("2010-04-15").getTime(), true, 60520, 34, 2480));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public List<Player> getAllPlayers1() {
//        System.out.println(allPlayers.toString());
//        return allPlayers;
//    }
}