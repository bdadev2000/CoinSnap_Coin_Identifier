package sf;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.duylt.lib.wheel_picker.WheelPicker;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import kf.e1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends mf.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25022h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f25023c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f25024d;

    /* renamed from: f, reason: collision with root package name */
    public final Function13 f25025f;

    /* renamed from: g, reason: collision with root package name */
    public SoundDomain f25026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReminderActivity activity, b6.c onCancel, sg.i onSave) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        this.f25023c = activity;
        this.f25024d = onCancel;
        this.f25025f = onSave;
        this.f25026g = new SoundDomain(0L, null, 0, 7, null);
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_add_remind;
    }

    @Override // mf.c
    public final void c() {
        String str;
        LocalDate now;
        DayOfWeek dayOfWeek;
        TextStyle textStyle;
        e1 e1Var = (e1) b();
        WheelPicker wheelPicker = e1Var.I;
        wheelPicker.setWrapSelectorWheel(true);
        wheelPicker.setWheelItemCount(3);
        wheelPicker.setMaxValue(23);
        int i10 = 0;
        wheelPicker.setMinValue(0);
        wheelPicker.setSelectedTextColor(R.color.txt_dark);
        wheelPicker.setUnselectedTextColor(R.color.txt_description);
        Intrinsics.checkNotNull(wheelPicker);
        WheelPicker.h(wheelPicker, new b(i10));
        WheelPicker wheelPicker2 = e1Var.J;
        wheelPicker2.setWrapSelectorWheel(true);
        wheelPicker2.setWheelItemCount(3);
        wheelPicker2.setMaxValue(59);
        wheelPicker2.setMinValue(0);
        wheelPicker2.setSelectedTextColor(R.color.txt_dark);
        wheelPicker2.setUnselectedTextColor(R.color.txt_description);
        Intrinsics.checkNotNull(wheelPicker2);
        WheelPicker.h(wheelPicker2, new b(i10));
        ((e1) b()).I.g(8);
        ((e1) b()).J.g(30);
        e1 e1Var2 = (e1) b();
        e1Var2.L.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.R.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.T.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.S.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.K.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.P.setTextColor(Color.parseColor("#7DC448"));
        e1Var2.O.setTextColor(Color.parseColor("#7DC448"));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f25026g = (SoundDomain) com.facebook.appevents.i.b(context).get(0);
        if (Build.VERSION.SDK_INT >= 26) {
            now = LocalDate.now();
            dayOfWeek = now.getDayOfWeek();
            textStyle = TextStyle.FULL;
            str = dayOfWeek.getDisplayName(textStyle, new Locale("en"));
            Intrinsics.checkNotNullExpressionValue(str, "getDisplayName(...)");
        } else {
            str = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}[Calendar.getInstance().get(7) - 1];
        }
        switch (str.hashCode()) {
            case -2049557543:
                if (str.equals("Saturday")) {
                    FrameLayout frameLayout = ((e1) b()).f20748x;
                    TextView tvSa = ((e1) b()).P;
                    Intrinsics.checkNotNullExpressionValue(tvSa, "tvSa");
                    h(frameLayout, tvSa);
                    break;
                }
                break;
            case -1984635600:
                if (str.equals("Monday")) {
                    FrameLayout frameLayout2 = ((e1) b()).f20746v;
                    TextView tvM = ((e1) b()).L;
                    Intrinsics.checkNotNullExpressionValue(tvM, "tvM");
                    h(frameLayout2, tvM);
                    break;
                }
                break;
            case -1807319568:
                if (str.equals("Sunday")) {
                    FrameLayout frameLayout3 = ((e1) b()).f20747w;
                    TextView tvS = ((e1) b()).O;
                    Intrinsics.checkNotNullExpressionValue(tvS, "tvS");
                    h(frameLayout3, tvS);
                    break;
                }
                break;
            case -897468618:
                if (str.equals("Wednesday")) {
                    FrameLayout frameLayout4 = ((e1) b()).D;
                    TextView tvW = ((e1) b()).T;
                    Intrinsics.checkNotNullExpressionValue(tvW, "tvW");
                    h(frameLayout4, tvW);
                    break;
                }
                break;
            case 687309357:
                if (str.equals("Tuesday")) {
                    FrameLayout frameLayout5 = ((e1) b()).A;
                    TextView tvT = ((e1) b()).R;
                    Intrinsics.checkNotNullExpressionValue(tvT, "tvT");
                    h(frameLayout5, tvT);
                    break;
                }
                break;
            case 1636699642:
                if (str.equals("Thursday")) {
                    FrameLayout frameLayout6 = ((e1) b()).B;
                    TextView tvTh = ((e1) b()).S;
                    Intrinsics.checkNotNullExpressionValue(tvTh, "tvTh");
                    h(frameLayout6, tvTh);
                    break;
                }
                break;
            case 2112549247:
                if (str.equals("Friday")) {
                    FrameLayout frameLayout7 = ((e1) b()).u;
                    TextView tvF = ((e1) b()).K;
                    Intrinsics.checkNotNullExpressionValue(tvF, "tvF");
                    h(frameLayout7, tvF);
                    break;
                }
                break;
        }
        ((e1) b()).Q.setSelected(true);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    @Override // mf.c
    public final void d() {
        FrameLayout btnM = ((e1) b()).f20746v;
        Intrinsics.checkNotNullExpressionValue(btnM, "btnM");
        com.bumptech.glide.e.p(btnM, new c(this, 3));
        FrameLayout btnT = ((e1) b()).A;
        Intrinsics.checkNotNullExpressionValue(btnT, "btnT");
        com.bumptech.glide.e.p(btnT, new c(this, 4));
        FrameLayout btnW = ((e1) b()).D;
        Intrinsics.checkNotNullExpressionValue(btnW, "btnW");
        com.bumptech.glide.e.p(btnW, new c(this, 5));
        FrameLayout btnTh = ((e1) b()).B;
        Intrinsics.checkNotNullExpressionValue(btnTh, "btnTh");
        com.bumptech.glide.e.p(btnTh, new c(this, 6));
        FrameLayout btnF = ((e1) b()).u;
        Intrinsics.checkNotNullExpressionValue(btnF, "btnF");
        com.bumptech.glide.e.p(btnF, new c(this, 7));
        FrameLayout btnSa = ((e1) b()).f20748x;
        Intrinsics.checkNotNullExpressionValue(btnSa, "btnSa");
        com.bumptech.glide.e.p(btnSa, new c(this, 8));
        FrameLayout btnS = ((e1) b()).f20747w;
        Intrinsics.checkNotNullExpressionValue(btnS, "btnS");
        com.bumptech.glide.e.p(btnS, new c(this, 9));
        LinearLayout btnVibration = ((e1) b()).C;
        Intrinsics.checkNotNullExpressionValue(btnVibration, "btnVibration");
        com.bumptech.glide.e.p(btnVibration, new c(this, 10));
        TextView btnCancel = ((e1) b()).f20745t;
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        com.bumptech.glide.e.p(btnCancel, new c(this, 11));
        TextView btnSave = ((e1) b()).f20749y;
        Intrinsics.checkNotNullExpressionValue(btnSave, "btnSave");
        com.bumptech.glide.e.p(btnSave, new c(this, 0));
        LinearLayout btnSound = ((e1) b()).f20750z;
        Intrinsics.checkNotNullExpressionValue(btnSound, "btnSound");
        com.bumptech.glide.e.p(btnSound, new c(this, 1));
        ConstraintLayout layoutContainer = ((e1) b()).H;
        Intrinsics.checkNotNullExpressionValue(layoutContainer, "layoutContainer");
        com.bumptech.glide.e.p(layoutContainer, new c(this, 2));
        ((e1) b()).E.setOnEditorActionListener(new pf.a(this, 1));
    }

    public final void f(Context context, EditText editText) {
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        editText.clearFocus();
    }

    public final boolean g() {
        if (!((e1) b()).L.isActivated() && !((e1) b()).R.isActivated() && !((e1) b()).K.isActivated() && !((e1) b()).T.isActivated() && !((e1) b()).S.isActivated() && !((e1) b()).K.isActivated() && !((e1) b()).P.isActivated() && !((e1) b()).O.isActivated()) {
            return false;
        }
        return true;
    }

    public final void h(View view, TextView textView) {
        if (view != null) {
            if (view.isActivated()) {
                view.setActivated(false);
                textView.setTextColor(Color.parseColor("#7DC448"));
            } else {
                view.setActivated(true);
                textView.setTextColor(Color.parseColor("#FFFFFF"));
            }
        }
    }
}
