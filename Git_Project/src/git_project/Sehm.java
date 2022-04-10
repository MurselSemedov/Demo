package git_project;
public class Sehm {
    public static void main(String[] args) {
        String[] ay={"Yanvar","Fevral","Mart","Aprel","May","Iyun","Iyul","Avqust","Sentyabr","Oktyabr","Noyabr","Dekabr"}; 
        int[] qiymet={2500,2700,1500,6500,1200,7800,1800,6800,3600,8500,1000,3200};
        int z=0,max=qiymet[1]-qiymet[0],y=1;
              for(int i=0;i<qiymet.length;i++)
              {
                  for(int j=i+1;j<qiymet.length;j++)
                  {
                      if((qiymet[j]-qiymet[i])>=max)
                      {
                          max=qiymet[j]-qiymet[i];
                          z=i;
                          y=j;
                      }
                  }  
              }
              System.out.println("Alacağı ay:"+ay[z]);
              System.out.println("Satacağı ay:"+ay[y]);
}
}
