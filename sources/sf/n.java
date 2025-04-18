package sf;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.duylt.lib.wheel_picker.WheelPicker;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.data.database.entities.AlarmEntity;
import com.plantcare.ai.identifier.plantid.domains.SoundDomain;
import com.plantcare.ai.identifier.plantid.ui.component.remind.ReminderActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kf.t1;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class n extends mf.c {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f25051j = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f25052c;

    /* renamed from: d, reason: collision with root package name */
    public final AlarmEntity f25053d;

    /* renamed from: f, reason: collision with root package name */
    public final int f25054f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f25055g;

    /* renamed from: h, reason: collision with root package name */
    public final Function13 f25056h;

    /* renamed from: i, reason: collision with root package name */
    public SoundDomain f25057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReminderActivity activity, AlarmEntity alarmEntity, int i10, b6.c onCancel, sg.j onSave) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(alarmEntity, "alarmEntity");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        this.f25052c = activity;
        this.f25053d = alarmEntity;
        this.f25054f = i10;
        this.f25055g = onCancel;
        this.f25056h = onSave;
        this.f25057i = new SoundDomain(0L, null, 0, 7, null);
    }

    @Override // mf.c
    public final int a() {
        return R.layout.dialog_update_remind;
    }

    @Override // mf.c
    public final void c() {
        List split$default;
        Object obj;
        String string;
        boolean z10;
        t1 t1Var = (t1) b();
        WheelPicker wheelPicker = t1Var.I;
        int i10 = 1;
        wheelPicker.setWrapSelectorWheel(true);
        wheelPicker.setWheelItemCount(3);
        wheelPicker.setMaxValue(23);
        wheelPicker.setMinValue(0);
        wheelPicker.setSelectedTextColor(R.color.txt_dark);
        wheelPicker.setUnselectedTextColor(R.color.txt_description);
        Intrinsics.checkNotNull(wheelPicker);
        WheelPicker.h(wheelPicker, new b(i10));
        WheelPicker wheelPicker2 = t1Var.J;
        wheelPicker2.setWrapSelectorWheel(true);
        wheelPicker2.setWheelItemCount(3);
        wheelPicker2.setMaxValue(59);
        wheelPicker2.setMinValue(0);
        wheelPicker2.setSelectedTextColor(R.color.txt_dark);
        wheelPicker2.setUnselectedTextColor(R.color.txt_description);
        Intrinsics.checkNotNull(wheelPicker2);
        WheelPicker.h(wheelPicker2, new b(i10));
        AlarmEntity alarmEntity = this.f25053d;
        String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(alarmEntity.getTime()));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        split$default = StringsKt__StringsKt.split$default(format, new String[]{":"}, false, 0, 6, (Object) null);
        Pair pair = new Pair(split$default.get(0), split$default.get(1));
        int parseInt = Integer.parseInt((String) pair.getFirst());
        int parseInt2 = Integer.parseInt((String) pair.getSecond());
        ((t1) b()).I.g(parseInt);
        ((t1) b()).J.g(parseInt2);
        t1 t1Var2 = (t1) b();
        t1Var2.L.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.R.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.T.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.S.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.K.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.P.setTextColor(Color.parseColor("#7DC448"));
        t1Var2.O.setTextColor(Color.parseColor("#7DC448"));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Iterator it = com.facebook.appevents.i.b(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SoundDomain) obj).getSrc() == this.f25054f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SoundDomain soundDomain = (SoundDomain) obj;
        if (soundDomain == null) {
            soundDomain = this.f25057i;
        }
        this.f25057i = soundDomain;
        if (alarmEntity.getDay(1)) {
            FrameLayout frameLayout = ((t1) b()).f20888v;
            TextView tvM = ((t1) b()).L;
            Intrinsics.checkNotNullExpressionValue(tvM, "tvM");
            h(frameLayout, tvM);
        }
        if (alarmEntity.getDay(2)) {
            FrameLayout frameLayout2 = ((t1) b()).A;
            TextView tvT = ((t1) b()).R;
            Intrinsics.checkNotNullExpressionValue(tvT, "tvT");
            h(frameLayout2, tvT);
        }
        if (alarmEntity.getDay(3)) {
            FrameLayout frameLayout3 = ((t1) b()).D;
            TextView tvW = ((t1) b()).T;
            Intrinsics.checkNotNullExpressionValue(tvW, "tvW");
            h(frameLayout3, tvW);
        }
        if (alarmEntity.getDay(4)) {
            FrameLayout frameLayout4 = ((t1) b()).B;
            TextView tvTh = ((t1) b()).S;
            Intrinsics.checkNotNullExpressionValue(tvTh, "tvTh");
            h(frameLayout4, tvTh);
        }
        if (alarmEntity.getDay(5)) {
            FrameLayout frameLayout5 = ((t1) b()).u;
            TextView tvF = ((t1) b()).K;
            Intrinsics.checkNotNullExpressionValue(tvF, "tvF");
            h(frameLayout5, tvF);
        }
        if (alarmEntity.getDay(6)) {
            FrameLayout frameLayout6 = ((t1) b()).f20890x;
            TextView tvSa = ((t1) b()).P;
            Intrinsics.checkNotNullExpressionValue(tvSa, "tvSa");
            h(frameLayout6, tvSa);
        }
        if (alarmEntity.getDay(7)) {
            FrameLayout frameLayout7 = ((t1) b()).f20889w;
            TextView tvS = ((t1) b()).O;
            Intrinsics.checkNotNullExpressionValue(tvS, "tvS");
            h(frameLayout7, tvS);
        }
        int soundRes = alarmEntity.getSoundRes();
        if (soundRes == 0) {
            string = getContext().getString(R.string.txt_default);
        } else if (soundRes == -1) {
            string = getContext().getString(R.string.silent);
        } else if (soundRes == R.raw.voice_air_horn) {
            string = getContext().getString(R.string.voice_sound_1);
        } else if (soundRes == R.raw.voice_alarm_clock) {
            string = getContext().getString(R.string.voice_sound_2);
        } else if (soundRes == R.raw.voice_cal_ringtone_1) {
            string = getContext().getString(R.string.voice_sound_3);
        } else if (soundRes == R.raw.voice_cell_ringtone_2) {
            string = getContext().getString(R.string.voice_sound_4);
        } else if (soundRes == R.raw.voice_classic_alarm) {
            string = getContext().getString(R.string.voice_sound_5);
        } else if (soundRes == R.raw.voice_discord_call) {
            string = getContext().getString(R.string.voice_sound_6);
        } else if (soundRes == R.raw.voice_gentle_guitar) {
            string = getContext().getString(R.string.voice_sound_7);
        } else if (soundRes == R.raw.voice_kalimba) {
            string = getContext().getString(R.string.voice_sound_8);
        } else if (soundRes == R.raw.voice_marimba_ringtone_5) {
            string = getContext().getString(R.string.voice_sound_9);
        } else if (soundRes == R.raw.voice_marimba_ringtone_9) {
            string = getContext().getString(R.string.voice_sound_10);
        } else if (soundRes == R.raw.voice_original_phone_ringtone) {
            string = getContext().getString(R.string.voice_sound_11);
        } else if (soundRes == R.raw.voice_ringtone) {
            string = getContext().getString(R.string.voice_sound_12);
        } else if (soundRes == R.raw.voice_ringtone_2) {
            string = getContext().getString(R.string.voice_sound_13);
        } else if (soundRes == R.raw.voice_ringtone_3) {
            string = getContext().getString(R.string.voice_sound_14);
        } else if (soundRes == R.raw.voice_ringtone_6) {
            string = getContext().getString(R.string.voice_sound_15);
        } else if (soundRes == R.raw.voice_ringtone_bubbly_bubbles) {
            string = getContext().getString(R.string.voice_sound_16);
        } else if (soundRes == R.raw.voice_ringtone_for_mobile_phone_with_cheerful_mood) {
            string = getContext().getString(R.string.voice_sound_17);
        } else if (soundRes == R.raw.voice_ringtone_jungle) {
            string = getContext().getString(R.string.voice_sound_18);
        } else if (soundRes == R.raw.voice_rooster) {
            string = getContext().getString(R.string.voice_sound_19);
        } else {
            string = getContext().getString(R.string.voice_sound_20);
        }
        Intrinsics.checkNotNull(string);
        ((t1) b()).Q.setText(string);
        ((t1) b()).Q.setSelected(true);
        ((t1) b()).G.setActivated(alarmEntity.isEnabled());
        ((t1) b()).F.setText(alarmEntity.getLabel());
        ((t1) b()).E.setText(alarmEntity.getDescription());
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    @Override // mf.c
    public final void d() {
        FrameLayout btnM = ((t1) b()).f20888v;
        Intrinsics.checkNotNullExpressionValue(btnM, "btnM");
        com.bumptech.glide.e.p(btnM, new m(this, 3));
        FrameLayout btnT = ((t1) b()).A;
        Intrinsics.checkNotNullExpressionValue(btnT, "btnT");
        com.bumptech.glide.e.p(btnT, new m(this, 4));
        FrameLayout btnW = ((t1) b()).D;
        Intrinsics.checkNotNullExpressionValue(btnW, "btnW");
        com.bumptech.glide.e.p(btnW, new m(this, 5));
        FrameLayout btnTh = ((t1) b()).B;
        Intrinsics.checkNotNullExpressionValue(btnTh, "btnTh");
        com.bumptech.glide.e.p(btnTh, new m(this, 6));
        FrameLayout btnF = ((t1) b()).u;
        Intrinsics.checkNotNullExpressionValue(btnF, "btnF");
        com.bumptech.glide.e.p(btnF, new m(this, 7));
        FrameLayout btnSa = ((t1) b()).f20890x;
        Intrinsics.checkNotNullExpressionValue(btnSa, "btnSa");
        com.bumptech.glide.e.p(btnSa, new m(this, 8));
        FrameLayout btnS = ((t1) b()).f20889w;
        Intrinsics.checkNotNullExpressionValue(btnS, "btnS");
        com.bumptech.glide.e.p(btnS, new m(this, 9));
        LinearLayout btnVibration = ((t1) b()).C;
        Intrinsics.checkNotNullExpressionValue(btnVibration, "btnVibration");
        com.bumptech.glide.e.p(btnVibration, new m(this, 10));
        TextView btnCancel = ((t1) b()).f20887t;
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        com.bumptech.glide.e.p(btnCancel, new m(this, 11));
        TextView btnSave = ((t1) b()).f20891y;
        Intrinsics.checkNotNullExpressionValue(btnSave, "btnSave");
        com.bumptech.glide.e.p(btnSave, new m(this, 0));
        ConstraintLayout layoutContainer = ((t1) b()).H;
        Intrinsics.checkNotNullExpressionValue(layoutContainer, "layoutContainer");
        com.bumptech.glide.e.p(layoutContainer, new m(this, 1));
        LinearLayout btnSound = ((t1) b()).f20892z;
        Intrinsics.checkNotNullExpressionValue(btnSound, "btnSound");
        com.bumptech.glide.e.p(btnSound, new m(this, 2));
        ((t1) b()).E.setOnEditorActionListener(new pf.a(this, 2));
    }

    public final void f(Context context, EditText editText) {
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        editText.clearFocus();
    }

    public final boolean g() {
        if (!((t1) b()).L.isActivated() && !((t1) b()).R.isActivated() && !((t1) b()).K.isActivated() && !((t1) b()).T.isActivated() && !((t1) b()).S.isActivated() && !((t1) b()).K.isActivated() && !((t1) b()).P.isActivated() && !((t1) b()).O.isActivated()) {
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
