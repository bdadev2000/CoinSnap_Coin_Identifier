package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class QF extends KY {
    public static String[] A02 = {"8bjSuFnY7Px2kfd2c5FIfhC79mNHlBDm", "1JhoOK1lCeFzNpWXu7eAiStn9xCsTPmH", "7NMloe4KmVhX4mabvoc5ZBvAFXalYV3E", "rfM3ikXL5SaocWaOB9TmjD2vsiJkKlJd", "sACTLZEyycWa5kMyrq", "mxP57EI80C5Gyk8oclCuNkT0toI", "e5qOGa2bHvCngaVTbxNZ2TaAb3gIhyF7", "QbLt5R1wGXlKwPtnoTvKgxPj8Dj"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ R2 A01;

    public QF(R2 r2, int i2) {
        this.A01 = r2;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        T7 videoView;
        T7 videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null && this.A00 <= 0) {
            R2 r2 = this.A01;
            String[] strArr = A02;
            if (strArr[6].charAt(3) == strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "CD7DGdNDLCY4UALZZjKA1HiDkec";
            strArr2[7] = "uQvfAiBAn4mqA7tCqZPrCPt4Ck3";
            videoView2 = r2.A00.A00.getVideoView();
            videoView2.A0e(false, 9);
        }
    }
}
