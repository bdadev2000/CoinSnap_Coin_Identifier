package z2;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.facebook.internal.v0;
import com.google.android.material.datepicker.l;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import h.e;
import h.i;
import h.j;
import kf.a0;
import kotlin.jvm.internal.Intrinsics;
import na.d;
import na.t;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28469c;

    public /* synthetic */ b(Object obj, int i10) {
        this.f28468b = i10;
        this.f28469c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = true;
        int i10 = 0;
        int i11 = this.f28468b;
        Object obj = this.f28469c;
        switch (i11) {
            case 0:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                int i12 = DefaultErrorActivity.f2780c;
                defaultErrorActivity.getClass();
                i iVar = new i(defaultErrorActivity);
                e eVar = iVar.a;
                eVar.f18535d = eVar.a.getText(R.string.customactivityoncrash_error_activity_error_details_title);
                eVar.f18537f = y2.c.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                i positiveButton = iVar.setPositiveButton(R.string.customactivityoncrash_error_activity_error_details_close, null);
                c cVar = new c(defaultErrorActivity, i10);
                e eVar2 = positiveButton.a;
                eVar2.f18542k = eVar2.a.getText(R.string.customactivityoncrash_error_activity_error_details_copy);
                eVar2.f18543l = cVar;
                j create = positiveButton.create();
                create.show();
                TextView textView = (TextView) create.findViewById(android.R.id.message);
                if (textView != null) {
                    textView.setTextSize(0, defaultErrorActivity.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
                    return;
                }
                return;
            case 1:
                ((MaxNativeAd) obj).performClick();
                return;
            case 2:
                v0 this$0 = (v0) obj;
                int i13 = v0.f11104o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.cancel();
                return;
            case 3:
                com.facebook.login.i this$02 = (com.facebook.login.i) obj;
                int i14 = com.facebook.login.i.f11223n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.g();
                return;
            case 4:
                int i15 = l.A;
                ((l) obj).c();
                throw null;
            case 5:
                d dVar = (d) obj;
                EditText editText = dVar.f22610i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    return;
                }
                return;
            case 6:
                ((na.j) obj).u();
                return;
            case 7:
                t tVar = (t) obj;
                EditText editText2 = tVar.f22699f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.f22699f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z10 = false;
                    }
                    if (z10) {
                        tVar.f22699f.setTransformationMethod(null);
                    } else {
                        tVar.f22699f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.f22699f.setSelection(selectionEnd);
                    }
                    tVar.q();
                    return;
                }
                return;
            default:
                OnBoardingActivity this$03 = (OnBoardingActivity) obj;
                int i16 = OnBoardingActivity.f16664l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                ((a0) this$03.n()).H.setCurrentItem(this$03.f16666g + 1);
                return;
        }
    }
}
