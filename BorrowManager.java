package Final;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class BorrowManager extends JFrame implements ActionListener{
	///////////////combobox/////////////
	String[] combobk = {"선택","ISBN","제목","저자","가격","출판년도","출판사","인기도"};
	String[] combobw = {"선택","ID","ISBN"};
	JComboBox cbbk = new JComboBox<String>(combobk);
	JComboBox cbbw = new JComboBox<String>(combobw);
	
	//////////table////////////
	
	////////////////File////////////////
	FileInputStream fin=null;
	ObjectInputStream ois=null;
	FileOutputStream fout;
	ObjectOutputStream oos;
	////////////////여러 TextArea들 //////////
	private TextArea BooksList = null;
	private TextArea BorrowsList = null; 
	private TextArea RestoreList = null;
	private TextArea AddList = null;
	private TextArea BookResult = null;
	private TextArea BorrowResult = null;
	//////////////////////////////////////
	Container pane;
	JFileChooser fc;
	private CardLayout CL = new CardLayout();
	/////////////////////GUI ITEMS
	private JPanel Main = new JPanel(CL);
	private JPanel Borrow = new JPanel(CL);
	private JPanel fileBorrow = new JPanel(CL);
	private JPanel fileBook = new JPanel(CL);
	private JPanel restore = new JPanel(CL);
	private JPanel addbook = new JPanel(CL);
	private JPanel viewBorrow = new JPanel(CL);
	private JPanel viewBook = new JPanel(CL);
	private JPanel SaveBorrow = new JPanel(CL);
	private JPanel SaveBook = new JPanel(CL);
	private JPanel Edit = new JPanel(CL);
	///////
	///////
	private JButton Brw = new JButton("대여");
	
	private JButton Rst = new JButton("반납");
	private JButton aBk = new JButton("책 추가 및 삭제");
	private JButton vBw = new JButton("대여목록,검색");
	private JButton vBk = new JButton("책목록,검색");
	private JButton edit = new JButton("책, 대여정보 편집");
	private JButton OK = new JButton("완료");
	private JButton SBKOK = new JButton("검색");
	private JButton SBKNO = new JButton("완료");
	private JButton SBWOK = new JButton("검색");
	private JButton SBWNO = new JButton("완료");
	private JButton BorrowOK = new JButton("완료");
	private JButton BorrowNO = new JButton("취소");
	private JButton BorrowView = new JButton("조회");
	private JButton RestoreOK = new JButton("완료");
	private JButton BKEdit = new JButton("완료");
	private JButton BWEdit = new JButton("완료");
	private JButton RestoreView = new JButton("ID 조회");
	private JLabel id = new JLabel("ID");
	private JLabel isbn = new JLabel("ISBN");
	private JLabel rid = new JLabel("ID");
	private JLabel risbn = new JLabel("ISBN");
	private JLabel searchbook1 = new JLabel("검색 기준");
	private JLabel searchbook2 = new JLabel("검색어");
	private JLabel searchborrow1 = new JLabel("검색 기준");
	private JLabel searchborrow2 = new JLabel("검색어");
	private JTextField searchbook = new JTextField();
	private JTextField searchborrow = new JTextField();
	private JTextField iid = new JTextField();
	private JTextField iisbn = new JTextField();
	private JTextField riid = new JTextField();
	private JTextField riisbn = new JTextField();
	private TextField Bnotice = new TextField(20);
	///////////책 추가//////////////
	private JLabel bisbn = new JLabel("ISBN");
	private JLabel disbn = new JLabel("ISBN");
	private JLabel btitle = new JLabel("제목");
	private JLabel bauthor = new JLabel("저자");
	private JLabel bprice = new JLabel("가격");
	private JLabel byear = new JLabel("출판년도");
	private JLabel bpub = new JLabel("출판사");
	private JLabel bpop = new JLabel("인기도");
	private JTextField ibisbn = new JTextField(20);
	private JTextField ibtitle = new JTextField(20);
	private JTextField ibauthor = new JTextField(20);
	private JTextField ibprice = new JTextField(20);
	private JTextField ibyear = new JTextField(20);
	private JTextField ibpub = new JTextField(20);
	private JTextField ibpop = new JTextField(20);
	private JTextField delisbn = new JTextField(20);
	///edit
	private JLabel leid = new JLabel("ID");
	private JLabel lebisbn = new JLabel("수정할 책 ISBN");
	private JLabel lewisbn = new JLabel("원래 ISBN");
	private JLabel lnewisbn = new JLabel("바꿀 ISBN");
	private JLabel letitle = new JLabel("제목");
	private JLabel leauthor = new JLabel("저자");
	private JLabel leprice = new JLabel("가격");
	private JLabel leyear = new JLabel("출판년도");
	private JLabel lepub = new JLabel("출판사");
	private JLabel lepop = new JLabel("인기도");
	private JTextField ewid = new JTextField(20);
	private JTextField ewisbn = new JTextField(20);
	private JTextField newisbn = new JTextField(20);
	private JTextField eisbn = new JTextField(20);
	private JTextField etitle = new JTextField(20);
	private JTextField eauthor = new JTextField(20);
	private JTextField eprice = new JTextField(20);
	private JTextField eyear = new JTextField(20);
	private JTextField epub = new JTextField(20);
	private JTextField epop = new JTextField(20);
	///
	private JButton addOK = new JButton("완료");
	private JButton delOK = new JButton("삭제");
	private JButton addNO = new JButton("취소");
	private JButton editNO = new JButton("취소");
	
	private JButton edit2Y = new JButton("완료");
	private JButton edit2N = new JButton("취소");
	/////////////////////////////
	JMenuBar mnb = new JMenuBar();
	JMenu mn = new JMenu("추가 메뉴");
	JMenuItem itmOpenBook, itmOpenBorrow , itmSaveBorrow ,itmSaveBook, itmExit;
	/////////////////////GUI
	BorrowManager(){
		///////////setBorder//////////
		Main.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"메인 화면")); 
		///////////edit///////////////
		JPanel edit1 = new JPanel();
		JPanel edit2 = new JPanel();
		Edit.setLayout(new GridLayout(1,2));
		edit1.setLayout(new GridLayout(4,2));
		edit1.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"대여 정보 수정")); 
		edit1.add(leid);
		edit1.add(ewid);
		edit1.add(lewisbn);
		edit1.add(ewisbn);
		edit1.add(lnewisbn);
		edit1.add(newisbn);
		edit1.add(BWEdit);
		edit1.add(editNO);
		edit2.add(lebisbn);
		edit2.add(eisbn);
		edit2.add(letitle);
		edit2.add(etitle);
		edit2.add(leauthor);
		edit2.add(eauthor);
		edit2.add(leprice);
		edit2.add(eprice);
		edit2.add(leyear);
		edit2.add(eyear);
		edit2.add(lepub);
		edit2.add(epub);
		edit2.add(lepop);
		edit2.add(epop);
		edit2.add(edit2Y);
		edit2.add(edit2N);
		edit2.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"책 정보 수정")); 
		edit2.setLayout(new GridLayout(8,2));
		Edit.setVisible(true);
		Edit.add(edit1);
		Edit.add(edit2);
		///////////viewBook///////////
		BookResult = new TextArea();
		BookResult.setText("출판년도,가격,인기도는 정확히 맞아야 검색됩니다.\n");
		JPanel vb1 = new JPanel();
		JPanel vb2 = new JPanel();
		viewBook.setLayout(new GridLayout(1,2));
		viewBook.add(vb1);
		viewBook.add(vb2);
		vb2.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"검색 결과")); 
		vb1.setLayout(new GridLayout(3,2));
		vb1.add(searchbook1);
		vb1.add(cbbk);
		vb1.add(searchbook2);
		vb1.add(searchbook);
		vb1.add(SBKOK);
		vb1.add(SBKNO);
		vb2.setLayout(new BorderLayout());
		vb2.add("Center",BookResult);
		///////////viewBorrow/////////
		BorrowResult = new TextArea();
		BorrowResult.setText("");
		JPanel vbw1 = new JPanel();
		JPanel vbw2 = new JPanel();
		viewBorrow.setLayout(new GridLayout(1,2));
		viewBorrow.add(vbw1);
		viewBorrow.add(vbw2);
		vbw1.setLayout(new GridLayout(3,2));
		vbw2.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"검색 결과")); 
		vbw1.add(searchborrow1);
		vbw1.add(cbbw);
		vbw1.add(searchborrow2);
		vbw1.add(searchborrow);
		vbw1.add(SBWOK);
		vbw1.add(SBWNO);
		vbw2.setLayout(new BorderLayout());
		vbw2.add("Center",BorrowResult);
		///////////Borrow/////////////
		Bnotice.setEditable(false);
		JPanel Borrow1 = new JPanel();
		JPanel Borrow2 = new JPanel();
		Borrow1.add(id);
		Borrow1.add(iid);
		Borrow1.add(isbn);
		Borrow1.add(iisbn);
		Borrow1.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"대여 정보")); 
		Borrow2.add(BorrowView);
		Borrow2.add(Bnotice);
		Borrow2.add(BorrowOK);
		Borrow2.add(BorrowNO);
		Borrow.setLayout(new GridLayout(2,1));
		Borrow.add(Borrow1);
		Borrow.add(Borrow2);
		Borrow1.setLayout(new GridLayout(2,2));
		///////////Restore////////////
		restore.setLayout(new GridLayout(1,2));
		JPanel Restore1 = new JPanel();
		Restore1.setLayout(new GridLayout(3,2));
		JPanel Restore2 = new JPanel();
		Restore2.setLayout(new BorderLayout());
		Restore2.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"조회 결과")); 
		RestoreList = new TextArea();
		RestoreList.setEditable(false);
		Restore1.add(rid);
		Restore1.add(riid);
		Restore1.add(risbn);
		Restore1.add(riisbn);
		Restore1.add(RestoreView);
		Restore1.add(RestoreOK);
		Restore2.add("Center",RestoreList);
		restore.add(Restore1);
		restore.add(Restore2);
		///////////AddBook////////////
		AddList = new TextArea();
		AddList.setEditable(false);
		JPanel addbook1 = new JPanel();
		addbook1.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"책 추가")); 
		JPanel addbook2 = new JPanel();
		JPanel addbook21 = new JPanel();
		addbook21.setBorder(new TitledBorder(new LineBorder(Color.red),"현재 책 목록"));
		JPanel addbook22 = new JPanel();
		addbook22.setBorder(new TitledBorder(new LineBorder(Color.BLUE),"책 정보 삭제")); 
		addbook.setLayout(new GridLayout(2,1));
		addbook1.setLayout(new GridLayout(2,8));
		addbook2.setLayout(new GridLayout(1,2));
		addbook22.setLayout(new GridLayout(2,2));
		addbook21.setLayout(new BorderLayout());
		addbook1.add(bisbn);
		addbook1.add(ibisbn);
		addbook1.add(btitle);
		addbook1.add(ibtitle);
		addbook1.add(bauthor);
		addbook1.add(ibauthor);
		addbook1.add(bprice);
		addbook1.add(ibprice);
		addbook1.add(byear);
		addbook1.add(ibyear);
		addbook1.add(bpub);
		addbook1.add(ibpub);
		addbook1.add(bpop);
		addbook1.add(ibpop);
		addbook1.add(addOK);
		addbook1.add(addNO);
		addbook2.add(addbook21);
		addbook2.add(addbook22);
		addbook21.add("Center",AddList);
		addbook22.add(disbn);
		addbook22.add(delisbn);
		addbook22.add(delOK);
		addbook.add(addbook2);
		addbook.add(addbook1);
		///////////TextAreas//////////
		BooksList = new TextArea();
		BorrowsList = new TextArea();
		BooksList.setEditable(false);
		BorrowsList.setEditable(false);
		//////////////////////////////
		pane = getContentPane();
		pane.setLayout(CL);
		//////////fileBorrow , Book////////////
		fileBook.setLayout(new BorderLayout());
		fileBook.add("Center",BooksList);
		fileBook.add("South",OK);
		fileBorrow.setLayout(new BorderLayout());
		fileBorrow.add("Center",BorrowsList);
		fileBorrow.add("South",OK);
		SaveBook.setLayout(new BorderLayout());
		SaveBook.add("Center",BooksList);
		SaveBook.add("South",OK);
		SaveBorrow.setLayout(new BorderLayout());
		SaveBorrow.add("Center",BorrowsList);
		SaveBorrow.add("South",OK);
		//////////saveBorrow , Book////////////
		SaveBorrow.add(BorrowsList);
		SaveBook.add(BorrowsList);
		//////////Menu//////////////////
		itmOpenBook = new JMenuItem("도서정보 불러오기");
		itmOpenBorrow = new JMenuItem("대여 데이터 불러오기");
		itmSaveBook = new JMenuItem("도서정보 저장하기");
		itmSaveBorrow = new JMenuItem("대여 데이터 저장하기");
		itmExit = new JMenuItem("Exit");
		mn.add(itmOpenBook);
		mn.add(itmOpenBorrow);
		mn.add(itmSaveBook);
		mn.add(itmSaveBorrow);
		mn.add(itmExit);
		mnb.add(mn);
		this.setJMenuBar(mnb);
		//////////ActionListener////////
		edit2Y.addActionListener(this);
		edit2N.addActionListener(this);
		BWEdit.addActionListener(this);
		editNO.addActionListener(this);
		delOK.addActionListener(this);
		SBWOK.addActionListener(this);
		SBWNO.addActionListener(this);
		BorrowNO.addActionListener(this);
		SBKOK.addActionListener(this);
		SBKNO.addActionListener(this);
		addOK.addActionListener(this);
		addNO.addActionListener(this);
		RestoreOK.addActionListener(this);
		RestoreView.addActionListener(this);
		BorrowOK.addActionListener(this);
		BorrowView.addActionListener(this);
		Brw.addActionListener(this);
		Rst.addActionListener(this);
		aBk.addActionListener(this);
		vBw.addActionListener(this);
		vBk.addActionListener(this);
		edit.addActionListener(this);
		itmOpenBook.addActionListener(this);
		itmOpenBorrow.addActionListener(this);
		itmSaveBorrow.addActionListener(this);
		itmSaveBook.addActionListener(this);
		itmExit.addActionListener(this);
		OK.addActionListener(this);
		//////////Main Panel////////////
		Main.setLayout(new GridLayout(2,3));
		Main.setSize(900,200);
		Main.add(Brw);
		Main.add(Rst);
		Main.add(aBk);
		Main.add(vBw);
		Main.add(vBk);
		Main.add(edit);
		/////////This Panel////////////
		this.setTitle("도서대여 자료관리 프로그램");
		this.setLayout(CL);
		pane.add("M",Main);
		pane.add("B",Borrow);
		pane.add("fB",fileBorrow);
		pane.add("R",restore);
		pane.add("aBk",addbook);
		pane.add("vBk",viewBook);
		pane.add("vBw",viewBorrow);
		pane.add("fBk",fileBook);
		pane.add("sBw",SaveBorrow);
		pane.add("sBk",SaveBook);
		pane.add("Edit",Edit);
		this.setVisible(true);
		this.setSize(700,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//////////버튼 누르기 메소드////////////
	public void Brw()
	{
		 CL.show(pane,"B");  mnb.setVisible(false);
	}
	public void Rst()
	{
		CL.show(pane,"R");  mnb.setVisible(false);
	}
	public void aBk()
	{
		CL.show(pane,"aBk");  mnb.setVisible(false); 
		for(int i=0;i<Books.size();i++)
		{
			AddList.append(Books.get(i).toString()+"\n");
		}
	}
	public void vBk()
	{
		CL.show(pane,"vBk"); mnb.setVisible(false); 
	}
	public void vBw()
	{
		CL.show(pane,"vBw");  mnb.setVisible(false); 
	}
	public void edit()
	{
		CL.show(pane,"Edit");  mnb.setVisible(false);
	}
	public void itmOpenBorrow() //대여정보 불러오기
	{
		CL.show(pane,"fB");
		mnb.setVisible(false);
		File f;
		fc = new JFileChooser();
		int answer = fc.showOpenDialog(null);
		if (answer == JFileChooser.APPROVE_OPTION) {
			f = fc.getSelectedFile();
			try {
				fin = new FileInputStream(f.getPath());
				ois = new ObjectInputStream(fin);
				ArrayList<Borrow> FileBorrows = (ArrayList)ois.readObject();
				Iterator <Borrow> it = FileBorrows.iterator();
				while(it.hasNext())
				{
					Borrow nb = (Borrow)it.next();
					BorrowsList.append(nb.toString()+"\n");
					Borrows.add(nb);
				}
				BorrowsList.append("데이터 파일로부터 읽기 완료");
			}catch(Exception ex){
			}finally{
				try{
					ois.close();
					fin.close();
				}catch(IOException ioe){}
			}
		}
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void itmOpenBook()
	{
		CL.show(pane,"fBk");
		mnb.setVisible(false);
		File f;
		fc = new JFileChooser();
		int answer = fc.showOpenDialog(null);
		if (answer == JFileChooser.APPROVE_OPTION) {
			f = fc.getSelectedFile();
			try {
				fin = new FileInputStream(f.getPath());
				ois = new ObjectInputStream(fin);
				ArrayList<Book> FileBooks = (ArrayList)ois.readObject();
				Iterator <Book> it = FileBooks.iterator();
				while(it.hasNext())
				{
					Book nb = (Book)it.next();
					BooksList.append(nb.toString()+"\n");
					Books.add(nb);
				}
				BooksList.append("데이터 파일로부터 읽기 완료");
			}catch(Exception ex){
			}finally{
				try{
					ois.close();
					fin.close();
				}catch(IOException ioe){}
			}
		}
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void itmExit()
	{
		System.exit(0);
	}
	public void OK()
	{
		 CL.show(pane,"M");  
		 mnb.setVisible(true); 
		 BooksList.setText(""); 
		 BorrowsList.setText(""); 
	}
	public void itmSaveBorrow()
	{
		CL.show(pane,"sBw");
		mnb.setVisible(false);
		for(int i=0;i<Borrows.size();i++)
		{
			BorrowsList.append(Borrows.get(i).toString()+"\n");
		}
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		fc = new JFileChooser();
		File f;
		String sPath1 = null;
		FileNameExtensionFilter filter = new FileNameExtensionFilter("파일 이름 뒤에 .dat 써주세요.(*.dat)","dat",".dat");
		fc.setFileFilter(filter);
		int answer1 = fc.showSaveDialog(null); 
		if (answer1 == JFileChooser.APPROVE_OPTION) {
			f = fc.getSelectedFile();
			sPath1 = f.getAbsolutePath();
		}
		PrintWriter pw1 = null;
		 try{
	            fout = new FileOutputStream(sPath1);
	            oos = new ObjectOutputStream(fout);
	            oos.writeObject(Borrows);
	            oos.reset();
	        }catch(Exception ex){
	        }finally{
	            try{
	                oos.close();
	                fout.close();
	            }catch(IOException ioe){}
	        }
		 BorrowsList.setText("");
		 CL.show(pane,"M");
		 mnb.setVisible(true);
	}
	public void itmSaveBook()
	{
		CL.show(pane,"sBk");
		mnb.setVisible(false);
		for(int i=0;i<Books.size();i++)
		{
			BooksList.append(Books.get(i).toString()+"\n");
		}
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		fc = new JFileChooser();
		File f;
		String sPath1 = null;
		FileNameExtensionFilter filter = new FileNameExtensionFilter("파일 이름 뒤에 .dat 써주세요.(*.dat)","dat",".dat");
		fc.setFileFilter(filter);
		int answer1 = fc.showSaveDialog(null); 
		if (answer1 == JFileChooser.APPROVE_OPTION) {
			f = fc.getSelectedFile();
			sPath1 = f.getAbsolutePath();
		}
		PrintWriter pw1 = null;
		 try{
	            fout = new FileOutputStream(sPath1);
	            oos = new ObjectOutputStream(fout);
	            oos.writeObject(Books);
	            oos.reset();
	        }catch(Exception ex){
	        }finally{
	            try{
	                oos.close();
	                fout.close();
	            }catch(IOException ioe){}
	        }
		 BooksList.setText("");
		 CL.show(pane,"M");
		 mnb.setVisible(true);
	}
	public void BorrowOK()
	{
		if( Bnotice.getText().equals("")|| Bnotice.getText().equals("맞는 책이 없습니다."));
		else {
			String newid = iid.getText();
			String newisbn = iisbn.getText();
			Borrows.add(new Borrow(newid,newisbn));
			CL.show(pane,"M");
			mnb.setVisible(true); 
			Bnotice.setText("");
			iid.setText("");
			iisbn.setText("");
		}
	}
	public void BorrowNO()
	{
		CL.show(pane,"M");
		mnb.setVisible(true); 
		Bnotice.setText("");
		iid.setText("");
		iisbn.setText("");
	}
	public void BorrowView()
	{
		int count=0;
		for(int i=0;i<Books.size();i++)
		{
			if(Books.get(i).getIsbn().equals(iisbn.getText())) count++;
		}
		if(count==0) Bnotice.setText("맞는 책이 없습니다.");
		else Bnotice.setText("대여 가능합니다.");
	}
	public void RestoreView()
	{
		for(int i=0;i<Borrows.size();i++)
		{
			if(riid.getText().equals(Borrows.get(i).getId())){
				RestoreList.append(Borrows.get(i).toString()+"\n");
			}
		}
		RestoreList.append("------------------------------"+"\n");
	}
	public void RestoreOK()
	{
		for(int i=0;i<Borrows.size();i++)
		{
			if(riid.getText().equals(Borrows.get(i).getId())&&riisbn.getText().equals(Borrows.get(i).getIsbn())) Borrows.remove(i);
		}
		CL.show(pane,"M");
		mnb.setVisible(true);
		riid.setText("");
		riisbn.setText("");
		RestoreList.setText("");
	}
	public void addNO()
	{
		delisbn.setText("");
		ibisbn.setText("");
		ibtitle.setText("");
		ibauthor.setText("");
		ibprice.setText("");
		ibyear.setText("");
		ibpub.setText("");
		ibpop.setText("");
		AddList.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void addOK()
	{
		Books.add(new Book(ibisbn.getText(),ibtitle.getText(),ibauthor.getText(),Integer.parseInt(ibprice.getText()),Integer.parseInt(ibyear.getText()),ibpub.getText(),Integer.parseInt(ibpop.getText())));
		ibisbn.setText("");
		ibtitle.setText("");
		delisbn.setText("");
		ibauthor.setText("");
		ibprice.setText("");
		ibyear.setText("");
		ibpub.setText("");
		ibpop.setText("");
		AddList.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void SBKNO()
	{
		searchbook.setText("");
		BookResult.setText("출판년도,가격,인기도는 정확히 맞아야 검색됩니다.\n");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void SBKOK()
	{
		String comboresult = (String)cbbk.getSelectedItem();
		for(int i=0;i<Books.size();i++)
		{
			if(comboresult.equals("ISBN"))
			{
				if(Books.get(i).getIsbn().contains(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("제목"))
			{
				if(Books.get(i).getTitle().contains(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("저자"))
			{
				if(Books.get(i).getAuthor().contains(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("가격"))
			{
				if(Books.get(i).getPrice()==Integer.parseInt(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("출판년도"))
			{
				if(Books.get(i).getYear()==Integer.parseInt(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("출판사"))
			{
				if(Books.get(i).getPub().contains(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
			else if(comboresult.equals("인기도"))
			{
				if(Books.get(i).getPop()==Integer.parseInt(searchbook.getText())) BookResult.append(Books.get(i).toString()+"\n");
			}
		}
		BookResult.append("------------------------------"+"\n");
	}
	public void SBWNO()
	{
		searchborrow.setText("");
		BorrowResult.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void SBWOK()
	{
		String comboresult = (String)cbbw.getSelectedItem();
		for(int i=0;i<Borrows.size();i++)
		{
			if(comboresult.equals("ISBN"))
			{
				if(Borrows.get(i).getIsbn().contains(searchborrow.getText())) BorrowResult.append(Borrows.get(i).toString()+"\n");
			}
			if(comboresult.contains("ID"))
			{
				if(Borrows.get(i).getId().contains(searchborrow.getText())) BorrowResult.append(Borrows.get(i).toString()+"\n");
			}
		}
		BorrowResult.append("------------------------------"+"\n");
	}
	public void delOK()
	{
		for(int i=0;i<Books.size();i++)
		{
			if(delisbn.getText().equals(Books.get(i).getIsbn()))
			{
				Books.remove(i);
			}
		}
		ibisbn.setText("");
		ibtitle.setText("");
		ibauthor.setText("");
		ibprice.setText("");
		ibyear.setText("");
		ibpub.setText("");
		ibpop.setText("");
		AddList.setText("");
		delisbn.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void editNO()
	{
		ewid.setText("");
		ewisbn.setText("");
		eisbn.setText("");
		etitle.setText("");
		eauthor.setText("");
		eprice.setText("");
		eyear.setText("");
		epub.setText("");
		newisbn.setText("");
		epop.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void BWEdit()
	{
		for(int i=0;i<Borrows.size();i++)
		{
			if((Borrows.get(i).getId().equals(ewid.getText()))&&(Borrows.get(i).getIsbn().equals(ewisbn.getText())))
			{
				Borrows.get(i).setIsbn(newisbn.getText());
			}
		}
		ewid.setText("");
		ewisbn.setText("");
		eisbn.setText("");
		etitle.setText("");
		eauthor.setText("");
		eprice.setText("");
		eyear.setText("");
		epub.setText("");
		epop.setText("");
		newisbn.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void edit2N()
	{
		ewid.setText("");
		ewisbn.setText("");
		eisbn.setText("");
		etitle.setText("");
		eauthor.setText("");
		eprice.setText("");
		eyear.setText("");
		epub.setText("");
		newisbn.setText("");
		epop.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	public void edit2Y()
	{
		for(int i=0;i<Books.size();i++)
		{
			if(Books.get(i).getIsbn().equals(eisbn.getText()))
			{
				Books.get(i).setTitle(etitle.getText());
				Books.get(i).setAuthor(eauthor.getText());
				Books.get(i).setPub(epub.getText());
				Books.get(i).setPop(Integer.parseInt(epop.getText()));
				Books.get(i).setYear(Integer.parseInt(eyear.getText()));
				Books.get(i).setPrice(Integer.parseInt(eprice.getText()));
			}
		}
		ewid.setText("");
		ewisbn.setText("");
		eisbn.setText("");
		etitle.setText("");
		eauthor.setText("");
		eprice.setText("");
		eyear.setText("");
		epub.setText("");
		epop.setText("");
		newisbn.setText("");
		CL.show(pane,"M");
		mnb.setVisible(true);
	}
	/////////////ActionEvent////////////
	public void actionPerformed(ActionEvent e) {
		////기본 메인 6개 버튼////
		if(e.getSource()==Brw) Brw(); 
		else if (e.getSource()==Rst) Rst();
		else if (e.getSource()==aBk) aBk();
		else if (e.getSource()==vBk) vBk();
		else if (e.getSource()==vBw) vBw();
		else if (e.getSource()==edit) edit();
		/////////////////////대여정보 불러오기////////////////
		else if (e.getSource()==itmOpenBorrow) itmOpenBorrow();
		///////////////////책정보 불러오기//////////////
		else if (e.getSource()==itmOpenBook) itmOpenBook();
		//////////////////////////////////////////
		else if (e.getSource()==itmExit) itmExit();
		else if (e.getSource()==OK) OK();
		///////////////////대여 저장/////////////////////////
		else if (e.getSource()==itmSaveBorrow) itmSaveBorrow();
		///////////////////책 저장////////////////////////
		else if (e.getSource()==itmSaveBook) itmSaveBook();
		else if(e.getSource()==BorrowOK) BorrowOK();
		else if(e.getSource()==BorrowNO) BorrowNO();
		else if(e.getSource()==BorrowView) BorrowView();
		else if(e.getSource()==RestoreView) RestoreView();
		else if(e.getSource()==RestoreOK) RestoreOK();
		else if(e.getSource()==addNO) addNO();
		else if(e.getSource()==addOK) addOK();
		else if(e.getSource()==SBKNO) SBKNO();
		else if(e.getSource()==SBKOK) SBKOK();
		else if(e.getSource()==SBWNO) SBWNO();
		else if(e.getSource()==SBWOK) SBWOK();
		else if(e.getSource()==delOK) delOK();
		else if(e.getSource()==editNO) editNO();
		else if(e.getSource()==BWEdit) BWEdit();
		else if(e.getSource()==edit2N) edit2N();
		else if(e.getSource()==edit2Y) edit2Y();
	}
	
	/////////////////////
	ArrayList<Borrow> Borrows = new ArrayList<Borrow>();
	ArrayList<Book> Books = new ArrayList<Book>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorrowManager bm = new BorrowManager();
		////대여,반납,책받아오기,책추가,대여리스트 내보내기,대여목록보기,대여검색,책검색
	}

}