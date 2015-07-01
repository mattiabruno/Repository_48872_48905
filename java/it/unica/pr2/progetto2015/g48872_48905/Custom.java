package it.unica.pr2.progetto2015.g48872_48905;

import it.unica.pr2.progetto2015.interfacce.SheetFunction;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Custom implements SheetFunction {
 
        @Override
	public Object execute(Object[] args){
            String path = (String) args[0];
            String nome = (String) args[1];
            String contenuto = (String) args[2];
            if( !(nomeValido(nome)) || (nome.length() == 0) )
                return false;
            else{
		try 
                {
                        if(contenuto.equals(""))
                            contenuto = " ";
			Document document = new Document();
                        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.NORMAL);
                        
			PdfWriter.getInstance(document, new FileOutputStream(path + nome + ".pdf"));
			document.open();
			document.newPage();
                        Paragraph pagina = new Paragraph(contenuto, font);
			document.add(pagina);
			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
                return true;
            } 
                
         
	}

        @Override
	public String getCategory(){
		return "Custom";
	}

        @Override
	public String getHelp(){
		return "Crea un file PDF dato un nome.";
	}

        @Override
	public String getName(){
		return "CREA PDF";
	}
        
        public boolean nomeValido(String nome){
            for(int i=0; i<nome.length(); i++){
                    char app = nome.charAt(i);
                    if( !(Character.isDigit(app) || Character.isLetter(app) || (Character.isSpaceChar(app) && i>0) ) )
                        return false; 
            }
            return true;
        }
}
