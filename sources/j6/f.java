package j6;

import Q7.AbstractC0255x;
import Q7.F;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.tools.arruler.app.ArRulerApplication;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import java.util.ArrayList;
import t7.y;
import u7.AbstractC2816g;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements F7.a {
    public final /* synthetic */ int b;

    public /* synthetic */ f(int i9) {
        this.b = i9;
    }

    @Override // F7.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return S7.j.a(0, null, 7);
            case 2:
                X7.e eVar = F.f2529a;
                return AbstractC0255x.a(V7.o.f3533a);
            case 3:
                ArRulerApplication arRulerApplication = ArRulerApplication.f19628g;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new M6.a("Hindi", "hi", false, Integer.valueOf(R.drawable.ic_hindi)));
                arrayList.add(new M6.a("Spanish", "es", false, Integer.valueOf(R.drawable.ic_spanish)));
                arrayList.add(new M6.a("Croatian", "hr", false, Integer.valueOf(R.drawable.ic_croatia)));
                arrayList.add(new M6.a("Czech", "cs", false, Integer.valueOf(R.drawable.ic_czech_republic)));
                arrayList.add(new M6.a("Dutch", "nl", false, Integer.valueOf(R.drawable.ic_dutch)));
                arrayList.add(new M6.a("English", "en", false, Integer.valueOf(R.drawable.ic_english)));
                arrayList.add(new M6.a("Filipino", "fil", false, Integer.valueOf(R.drawable.ic_filipino)));
                arrayList.add(new M6.a("French", "fr", false, Integer.valueOf(R.drawable.ic_france)));
                arrayList.add(new M6.a("German", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, false, Integer.valueOf(R.drawable.ic_german)));
                arrayList.add(new M6.a("Indonesian", "in", false, Integer.valueOf(R.drawable.ic_indonesian)));
                arrayList.add(new M6.a("Italian", "it", false, Integer.valueOf(R.drawable.ic_italian)));
                arrayList.add(new M6.a("Japanese", "ja", false, Integer.valueOf(R.drawable.ic_japanese)));
                arrayList.add(new M6.a("Korean", "ko", false, Integer.valueOf(R.drawable.ic_korean)));
                arrayList.add(new M6.a("Malay", "ms", false, Integer.valueOf(R.drawable.ic_malay)));
                arrayList.add(new M6.a("Polish", "pl", false, Integer.valueOf(R.drawable.ic_polish)));
                arrayList.add(new M6.a("Portuguese", "pt", false, Integer.valueOf(R.drawable.ic_portugal)));
                arrayList.add(new M6.a("Russian", "ru", false, Integer.valueOf(R.drawable.ic_russian)));
                arrayList.add(new M6.a("Serbian", "sr", false, Integer.valueOf(R.drawable.ic_serbian)));
                arrayList.add(new M6.a("Swedish", "sv", false, Integer.valueOf(R.drawable.ic_swedish)));
                arrayList.add(new M6.a("Turkish", "tr", false, Integer.valueOf(R.drawable.ic_turkish)));
                arrayList.add(new M6.a("Vietnamese", "vi", false, Integer.valueOf(R.drawable.ic_vietnamese)));
                arrayList.add(new M6.a("China", "zh", false, Integer.valueOf(R.drawable.ic_china)));
                return AbstractC2816g.T(arrayList);
            default:
                int i9 = ArRulerActivity.f19637r;
                return y.f23029a;
        }
    }
}
