package Final;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class borrowout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout = null;
        ObjectOutputStream oos = null;
		ArrayList<Book> Bks = new ArrayList<Book>();
		ArrayList<Borrow> Bws = new ArrayList<Borrow>();
		Bks.add(new Book("9788956608563","키스 앤 텔","알랭 드 보통",12000,2015,"은행나무",5));
		Bws.add(new Borrow("김효동","9788956608563"));
		Bks.add(new Book("9791186288139","어린왕자","생텍쥐페리",12000,2015,"노마드",9));
		Bws.add(new Borrow("이병철","9791186288139"));;
		Bks.add(new Book("9788965133490","행복만을 보았다","그레구아르 들라쿠르",13800,2015,"문학테라피",8));
		Bws.add(new Borrow("이건희","9788965133490"));
		Bks.add(new Book("9791195008360","검은 수련","미셸 뷔시",13800,2015,"달콤한책",9));
		Bws.add(new Borrow("이재용","9791195008360"));
		Bks.add(new Book("9788932916514","푸른 수염","아멜리 노통브",11800,2014,"열린책들",8));
		Bws.add(new Borrow("이부진","9788932916514"));
		Bks.add(new Book("9791195008339","그림자 소녀","미셸 뷔시",15000,2014,"달콤한책",8));
		Bws.add(new Borrow("원빈","9791195008339"));
		Bks.add(new Book("9788932916378","제3인류 1","베르나르 베르베르",13800,2013,"열린책들",8));
		Bws.add(new Borrow("이나영","9788932916378"));
		Bks.add(new Book("9788932916385","제3인류 2","베르나르 베르베르",13800,2013,"열린책들",8));
		Bws.add(new Borrow("김건모","9788932916385"));
		Bks.add(new Book("9788932916484","제3인류 3","베르나르 베르베르",13800,2014,"열린책들",8));
		Bws.add(new Borrow("하현우","9788932916484"));
		Bks.add(new Book("9788932916491","제3인류 4","베르나르 베르베르",13800,2014,"열린책들",8)); //10
		Bws.add(new Borrow("전규호","9788932916491"));
		Bks.add(new Book("9788984318984","주름","박범신",13500,2015,"한겨레출판",9));
		Bws.add(new Borrow("이정길","9788984318984"));
		Bks.add(new Book("9788954635257","국경시장","김성중",12000,2015,"문학동네",8));
		Bws.add(new Borrow("김기범","9788954635257"));
		Bks.add(new Book("9791130604510","연인 심청","방민호",13800,2015,"다산책방",7));
		Bws.add(new Borrow("매튜 벨라미","9791130604510"));
		Bks.add(new Book("9788963191034","비단길","장정옥",12000,2014,"북멘토",10));
		Bws.add(new Borrow("크리스 볼첸홈","9788963191034"));
		Bks.add(new Book("899515120X","난장이가 쏘아올린 작은 공","조세희",9000,2000,"이성과 힘",8));
		Bws.add(new Borrow("도미닉 하워드","899515120X"));
		Bks.add(new Book("9788993964844","싸드","김진명",14200,2014,"새움",8));
		Bws.add(new Borrow("톰 요크","9788993964844"));
		Bks.add(new Book("9788956604992","7년의 밤","정유정",13000,2011,"은행나무",9));
		Bws.add(new Borrow("조니 그린우드","9788956604992"));
		Bks.add(new Book("9788936433673","엄마를 부탁해","신경숙",12000,2008,"창비",9));
		Bws.add(new Borrow("에드 오브리엔","9788936433673"));
		Bks.add(new Book("9788954617246","칼의 노래","김훈",14000,2012,"문학동네",8));
		Bws.add(new Borrow("콜린 그린우드","9788954617246"));
		Bks.add(new Book("9788957980132","유진과 유진","이금이",11500,2004,"푸른책들",9)); //20
		Bws.add(new Borrow("필 셀웨이","9788957980132"));
		Bks.add(new Book("9788972756194","나미야 잡화점의 기적","히가시노 게이고",14800,2012,"현대문학",9));
		Bws.add(new Borrow("앤디 벨","9788972756194"));
		Bks.add(new Book("9788970123691","상실의 시대","무라카미 하루키",12800,2010,"문학사상사",8));
		Bws.add(new Borrow("겜 아처","9788970123691"));
		Bks.add(new Book("8972753696","용의자 X의 헌신","히가시노 게이고",13000,2006,"현대문학",9));
		Bws.add(new Borrow("노엘 갤러거","8972753696"));
		Bks.add(new Book("9788954608640","1Q84 1","무라카미 하루키",14800,2009,"문학동네",8));
		Bws.add(new Borrow("리암 갤러거","9788954608640"));
		Bks.add(new Book("9788954608657","1Q84 2","무라카미 하루키",14800,2009,"문학동네",8));
		Bws.add(new Borrow("민경훈","9788954608657"));
		Bks.add(new Book("9788954611800","1Q84 3","무라카미 하루키",14800,2010,"문학동네",8));
		Bws.add(new Borrow("김예준","9788954611800"));
		Bks.add(new Book("9788973813711","냉정과 열정사이 : ROSSO","에쿠니 가오리",12000,2000,"소담출판사",8));
		Bws.add(new Borrow("윤우현","9788973813711"));
		Bks.add(new Book("9788973813704","냉정과 열정사이 : BLU","츠지 히토나리",12000,2009,"소담출판사",8));
		Bws.add(new Borrow("신준기","9788973813704"));
		Bks.add(new Book("9788955617412","환상의 빛","미야모토 테루",9000,2014,"바다출판사",8));
		Bws.add(new Borrow("손성희","9788955617412"));
		Bks.add(new Book("9788937460616","설국","가와바타 야스나리",7000,2002,"민음사",8)); //30
		Bws.add(new Borrow("존 레논","9788937460616"));
		Bks.add(new Book("9788937450501","삼국지 전10권","나관중",80000,2002,"민음사",9));
		Bws.add(new Borrow("폴 매카트니","9788937450501"));
		Bks.add(new Book("9788936471163","아Q정전","루쉰",9000,2006,"창비",7));
		Bws.add(new Borrow("조지 해리슨","9788936471163"));
		Bks.add(new Book("9788990220783","로빙화","중자오정",9000,2008,"양철북",9));
		Bws.add(new Borrow("링고 스타","9788990220783"));
		Bks.add(new Book("9788954619554","열세 걸음","모옌",15000,2012,"문학동네",8));
		Bws.add(new Borrow("윤도현","9788954619554"));
		Bks.add(new Book("9788932026602","붉은 수수밭","모옌",19000,2014,"문학과지성사",8));
		Bws.add(new Borrow("김범수","9788932026602"));
		Bks.add(new Book("9788971847282","내게는 이름이 없다","위화",12000,2013,"푸른숲",8));
		Bws.add(new Borrow("김연우","9788971847282"));
		Bks.add(new Book("9788937490583","개구리","모옌",15000,2012,"민음사",8));
		Bws.add(new Borrow("김경호","9788937490583"));
		Bks.add(new Book("9788908071209","생활의 발견","린위탕,임어당",15000,2011,"범우사",9));
		Bws.add(new Borrow("윤민수","9788908071209"));
		Bks.add(new Book("9788959758340","13.67","찬호께이",17000,2015,"한스미디어",10));
		Bws.add(new Borrow("조규찬","9788959758340"));
		Bks.add(new Book("9791156620884","말 한 마디 때문에","류전윈",14800,2015,"아시아",9)); //40
		Bws.add(new Borrow("장헤진","9791156620884"));
		Bks.add(new Book("9788901177977","문득 사람이 그리운 날엔 시를 읽는다","박광수",11000,2014,"걷는나무",8));
		Bws.add(new Borrow("거미","9788901177977"));
		Bks.add(new Book("9791195511204","내 하루는 늘 너를 우연히 만납니다","김준",12800,2015,"글길나루",9));
		Bws.add(new Borrow("박정현","9791195511204"));
		Bks.add(new Book("9788982813849","순간의 꽃","고은",8500,2001,"문학동네",9));
		Bws.add(new Borrow("임재범","9788982813849"));
		Bks.add(new Book("9788901121185","딸아, 외로울 때는 시를 읽으렴","신현림",9000,2011,"걷는나무",9));
		Bws.add(new Borrow("조관우","9788901121185"));
		Bks.add(new Book("9788927804727","서울 시 2","하상욱",9800,2013,"중앙북스",8));
		Bws.add(new Borrow("조용필","9788927804727"));
		Bks.add(new Book("9791185014838","수선화에게","정호승",10000,2015,"비채",8));
		Bws.add(new Borrow("김태원","9791185014838"));
		Bks.add(new Book("9788993838220","나의 상처는 돌 너의 상처는 꽃","류시화",8500,2012,"문학의숲",9));
		Bws.add(new Borrow("이정","9788993838220"));
		Bks.add(new Book("9788932023656","나는 이 세상에 없는 계절이다","김경주",8000,2012,"문학과지성사",9));
		Bws.add(new Borrow("이적","9788932023656"));
		Bks.add(new Book("9788979441758","하늘과 바람과 별과 시","윤동주",6800,2003,"책만드는집",9));
		Bws.add(new Borrow("조장혁","9788979441758"));
		Bks.add(new Book("9788979443813","편지","이정하",10000,2012,"책만드는집",9)); //50
		Bws.add(new Borrow("소향","9788979443813"));
		Bks.add(new Book("9788983711892","코스모스","칼 세이건",18500,2006,"사이언스북스",9));
		Bws.add(new Borrow("더 원","9788983711892"));
		Bks.add(new Book("9788996588733","정재승의 과학 콘서트","",13500,2011,"어크로스",8));
		Bws.add(new Borrow("윤하","9788996588733"));
		Bks.add(new Book("9788932471631","이기적 유전자","리처드 도킨스",18000,2010,"을유문화사",8));
		Bws.add(new Borrow("김광석","9788932471631"));
		Bks.add(new Book("9788952773326","위험한 과학책","랜들 먼로",22000,2015,"시공사",9));
		Bws.add(new Borrow("성시경","9788952773326"));
		Bks.add(new Book("9788972913641","거의 모든 것의 역사","빌 브라이슨",23000,2003,"까치글방",9));
		Bws.add(new Borrow("박윤식","9788972913641"));
		Bks.add(new Book("9788983718822","구글 신은 모든 것을 알고 있다","정하웅,김동섭,이해웅",22000,2014,"사이언스북스",8));
		Bws.add(new Borrow("이상면","9788983718822"));
		Bks.add(new Book("9788972915546","과학혁명의 구조","토마스 쿤",18000,2013,"까치글방",8));
		Bws.add(new Borrow("한경록","9788972915546"));
		Bks.add(new Book("9788934956969","현실, 그 가슴 뛰는 마법","리처드 도킨스",22000,2012,"김영사",9));
		Bws.add(new Borrow("이상혁","9788934956969"));
		Bks.add(new Book("9788925541648","로지코믹스","아포스톨로스 독시아디스,크리스토스 H. 파파디미트리우",12000,2011,"랜덤하우스코리아",8));
		Bws.add(new Borrow("김인수","9788925541648"));
		Bks.add(new Book("9788956602189","생물과 무생물 사이","후쿠오카 신이치",12000,2008,"은행나무",9)); //60
		Bws.add(new Borrow("이선웅","9788956602189"));
		Bks.add(new Book("9788997263752","조선 임금 잔혹사","조민기",15000,2014,"책비",9));
		Bws.add(new Borrow("최진","9788997263752"));
		Bks.add(new Book("9788970656014","발해고","유득공",10000,2000,"홍익출판사",7));
		Bws.add(new Borrow("김정식","9788970656014"));
		Bks.add(new Book("9788970127248","총, 균, 쇠","제레드 다이아몬드",28000,2005,"문학사상사",9));
		Bws.add(new Borrow("이지은","9788970127248"));
		Bks.add(new Book("9791130605180","호, 조선 선비의 자존심","한정주",33000,2015,"다산초당",10));
		Bws.add(new Borrow("박재상","9791130605180"));
		Bks.add(new Book("8974831740","징비록","유성룡",8700,2003,"서해문집",9));
		Bws.add(new Borrow("길성준","8974831740"));
		Bks.add(new Book("9788936471712","유배지에서 보낸 편지","정약용",12000,2009,"창비",8));
		Bws.add(new Borrow("강희건","9788936471712"));
		Bks.add(new Book("9788984318922","역사와 책임","한홍구",12000,2015,"한겨레출판",9));
		Bws.add(new Borrow("송지효","9788984318922"));
		Bks.add(new Book("9788961880848","오래된 미래","헬레나 노 르베리 호지",12000,2007,"중앙북스",8));
		Bws.add(new Borrow("이선희","9788961880848"));
		Bks.add(new Book("9788998439156","밥의 인문학","정혜경",16000,2015,"따비",7));
		Bws.add(new Borrow("박효신","9788998439156"));
		Bks.add(new Book("9788937426810","사기본기","사마천",25000,2010,"민음사",8)); //70
		Bws.add(new Borrow("조빈","9788937426810"));
		Bks.add(new Book("9788982735745","눈물을 마시는 새 1","이영도",15500,2003,"황금가지",9));
		Bws.add(new Borrow("이혁","9788982735745"));
		Bks.add(new Book("9788982735752","눈물을 마시는 새 2","이영도",15500,2003,"황금가지",9));
		Bws.add(new Borrow("김정유","9788982735752"));
		Bks.add(new Book("9788982735769","눈물을 마시는 새 3","이영도",15500,2003,"황금가지",9));
		Bws.add(new Borrow("정무웅","9788982735769"));
		Bks.add(new Book("9788982735776","눈물을 마시는 새 4","이영도",15000,2003,"황금가지",9));
		Bws.add(new Borrow("이기철","9788982735776"));
		Bks.add(new Book("9788932915258","신 1부","베르나르 베르베르",14800,2011,"열린책들",8));
		Bws.add(new Borrow("이승기","9788932915258"));
		Bks.add(new Book("9788932915265","신 2부","베르나르 베르베르",14800,2011,"열린책들",8));
		Bws.add(new Borrow("허각","9788932915265"));
		Bks.add(new Book("9788932915272","신 3부","베르나르 베르베르",14800,2011,"열린책들",8));
		Bws.add(new Borrow("박진영","9788932915272"));
		Bks.add(new Book("9788998274238","레프트오버","톰 페로타",15000,2015,"북플라자",8));
		Bws.add(new Borrow("나얼","9788998274238"));
		Bks.add(new Book("9791156756040","하우스 오브 카드","마이클 돕스",14800,2015,"푸른숲",9));
		Bws.add(new Borrow("윤미래","9791156756040"));
		Bks.add(new Book("9791195518609","기다리는 집","황선미",10000,2015,"esteem",9)); //80
		Bws.add(new Borrow("백지영","9791195518609"));
		Bks.add(new Book("9788994013229","성난 군중으로부터 멀리","토머스 하디",11800,2015,"나무의철학",8));
		Bws.add(new Borrow("정인","9788994013229"));
		Bks.add(new Book("9788952230683","의자 뺏기","박하령",11000,2015,"살림",9));
		Bws.add(new Borrow("이수영","9788952230683"));
		Bks.add(new Book("9788952230287","원 플러스 원","조조 모예스",15000,2014,"살림",8));
		Bws.add(new Borrow("잭 블랙","9788952230287"));
		Bks.add(new Book("9788965702313","한복 입은 남자","이상훈",15000,2014,"박하",9));
		Bws.add(new Borrow("신옥철","9788965702313"));
		Bks.add(new Book("9788959138401","연애의 발견","정현정, 오승희",12800,2014,"예담",9));
		Bws.add(new Borrow("손승연","9788959138401"));
		Bks.add(new Book("9788988404850","내 영혼이 따뜻했던 날들","포리스트 카터",18000,2014,"아름드리미디어",9));
		Bws.add(new Borrow("정기석","9788988404850"));
		Bks.add(new Book("9788950956332","명량","김호경, 김한민, 전철홍",13800,2014,"21세기북스",9));
		Bws.add(new Borrow("이소라","9788950956332"));
		Bks.add(new Book("9788949123349","파라나","이옥수",11000,2014,"비룡소",9));
		Bws.add(new Borrow("기성용","9788949123349"));
		Bks.add(new Book("9788997023189","엔더의 게임","올슨 스캇 카드",16000,2013,"루비박스",9));
		Bws.add(new Borrow("손흥민","9788997023189"));
		Bks.add(new Book("9788960175037","선암여고 탐정단","박하익",12000,2013,"황금가지",9)); //90
		Bws.add(new Borrow("류현진","9788960175037"));
		Bks.add(new Book("9788954610681","은교","박범신",12000,2010,"문학동네",8));
		Bws.add(new Borrow("박찬호","9788954610681"));
		Bks.add(new Book("9788936433703","도가니","공지영",12000,2009,"창비",8));
		Bws.add(new Borrow("이승엽","9788936433703"));
		Bks.add(new Book("9788958283508","오이대왕","크리스티네 뇌스틀링거",9800,2009,"사계절",9));
		Bws.add(new Borrow("김진수","9788958283508"));
		Bks.add(new Book("9788992632201","빨간 머리 앤","루시 모드 몽고메리",14800,20008,"인디고",9));
		Bws.add(new Borrow("이청용","9788992632201"));
		Bks.add(new Book("9788958282952","두사람","이보나 흐미엘레프스카",9800,2008,"사계절",9));
		Bws.add(new Borrow("배성재","9788958282952"));
		Bks.add(new Book("9788936433635","완득이","김려령",11000,2008,"창비",9));
		Bws.add(new Borrow("장제스","9788936433635"));
		Bks.add(new Book("9788937830891","밤의 피크닉","온다 리쿠",12000,2005,"북폴리오",8));
		Bws.add(new Borrow("모택동","9788937830891"));
		Bks.add(new Book("9788958281313","바르톨로메는 개가 아니다","라헐 판 코에이",10500,2005,"사계절출판사",9));
		Bws.add(new Borrow("등소평","9788958281313"));
		Bks.add(new Book("9788937461040","네루다의 우편배달부","안토니오 스카르메타",8000,2004,"민음사",9));
		Bws.add(new Borrow("시진핑","9788937461040"));
		Bks.add(new Book("9788988027400","죽은 시인의 사회","N.H 클라인바움",12500,2004,"서교출판사",9)); //100
		Bws.add(new Borrow("오바마","9788988027400"));
		
		try{
			fout = new FileOutputStream("finalbooklist.dat");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(Bks);
            oos.reset();
            System.out.println("저장되었습니다1");
            
            fout = new FileOutputStream("finalborrowlist.dat");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(Bws);
            oos.reset();
            System.out.println("저장되었습니다2");
             
        }catch(Exception ex){
        }finally{
            try{
                oos.close();
                fout.close();
            }catch(IOException ioe){}
        }
	}

}
