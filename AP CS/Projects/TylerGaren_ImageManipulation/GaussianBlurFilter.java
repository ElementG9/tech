public class GaussianBlurFilter implements Filter
{
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        int[][] redData = new int[data.length][data[0].length];
        int[][] greenData = new int[data.length][data[0].length];
        int[][] blueData = new int[data.length][data[0].length];
        int[][] filter = {{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
        Pixel[][] newData = Helper.applyFilter(data, filter);
        pi.setData(newData);
    }
}
