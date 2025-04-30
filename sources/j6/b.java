package J6;

import G7.j;
import N6.h;
import O7.g;
import T.H0;
import T.K0;
import T7.r;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.tools.arruler.models.InternalImageModel;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import java.util.ArrayList;
import java.util.List;
import u6.AbstractC2795k;
import u6.Y;
import u7.AbstractC2816g;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1599a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.f1599a = i9;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        H0 h02;
        WindowInsetsController insetsController;
        r rVar;
        Object value;
        H0 h03;
        WindowInsetsController insetsController2;
        Object obj = this.b;
        switch (this.f1599a) {
            case 0:
                c cVar = (c) obj;
                j.e(cVar, "this$0");
                if (i9 != 6) {
                    return false;
                }
                View view = ((Y) cVar.a()).f19787f;
                j.d(view, "getRoot(...)");
                Window window = cVar.f1600c.getWindow();
                E1.c cVar2 = new E1.c(view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    insetsController = window.getInsetsController();
                    K0 k02 = new K0(insetsController, cVar2);
                    k02.f2868n = window;
                    h02 = k02;
                } else if (i10 >= 26) {
                    h02 = new H0(window, cVar2);
                } else {
                    h02 = new H0(window, cVar2);
                }
                h02.O(8);
                view.clearFocus();
                ((Y) cVar.a()).f23237q.clearFocus();
                return true;
            default:
                int i11 = ImageLibraryActivity.l;
                ImageLibraryActivity imageLibraryActivity = (ImageLibraryActivity) obj;
                j.e(imageLibraryActivity, "this$0");
                if (i9 != 3) {
                    return false;
                }
                N6.j u8 = imageLibraryActivity.u();
                String obj2 = g.a0(textView.getText().toString()).toString();
                j.e(obj2, "name");
                ArrayList arrayList = u8.f2120e;
                arrayList.clear();
                List list = u8.f2119d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (g.E(obj2, ((InternalImageModel) obj3).getName())) {
                        arrayList2.add(obj3);
                    }
                }
                List R4 = AbstractC2816g.R(new C5.c(6), arrayList2);
                do {
                    rVar = u8.f2118c;
                    value = rVar.getValue();
                    ((h) value).getClass();
                } while (!rVar.b(value, new h(R4)));
                Log.e("TAG", "searchImagesByName: " + R4.size());
                arrayList.addAll(R4);
                AppCompatEditText appCompatEditText = ((AbstractC2795k) imageLibraryActivity.k()).f23337q;
                j.d(appCompatEditText, "edtSearch");
                Window window2 = imageLibraryActivity.getWindow();
                E1.c cVar3 = new E1.c(appCompatEditText);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    insetsController2 = window2.getInsetsController();
                    K0 k03 = new K0(insetsController2, cVar3);
                    k03.f2868n = window2;
                    h03 = k03;
                } else if (i12 >= 26) {
                    h03 = new H0(window2, cVar3);
                } else {
                    h03 = new H0(window2, cVar3);
                }
                h03.O(8);
                appCompatEditText.clearFocus();
                ((AbstractC2795k) imageLibraryActivity.k()).f23337q.clearFocus();
                return true;
        }
    }
}
