package com.google.android.material.datepicker;

import M0.C0219j;
import T.H0;
import T.K0;
import a.AbstractC0325a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w;
import com.applovin.impl.L;
import com.google.android.material.internal.CheckableImageButton;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC0487w {
    public final LinkedHashSet b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f14035c;

    /* renamed from: d, reason: collision with root package name */
    public int f14036d;

    /* renamed from: f, reason: collision with root package name */
    public r f14037f;

    /* renamed from: g, reason: collision with root package name */
    public b f14038g;

    /* renamed from: h, reason: collision with root package name */
    public j f14039h;

    /* renamed from: i, reason: collision with root package name */
    public int f14040i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14041j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14042k;
    public int l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f14043n;

    /* renamed from: o, reason: collision with root package name */
    public int f14044o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f14045p;

    /* renamed from: q, reason: collision with root package name */
    public int f14046q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f14047r;

    /* renamed from: s, reason: collision with root package name */
    public int f14048s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f14049t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14050u;

    /* renamed from: v, reason: collision with root package name */
    public CheckableImageButton f14051v;

    /* renamed from: w, reason: collision with root package name */
    public R3.g f14052w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14053x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f14054y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f14055z;

    public k() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.f14035c = new LinkedHashSet();
    }

    public static int d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c9 = u.c();
        c9.set(5, 1);
        Calendar b = u.b(c9);
        b.get(2);
        b.get(1);
        int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean e(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0325a.p(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, new int[]{i9});
        boolean z8 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8;
    }

    public final void c() {
        L.r(getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14036d = bundle.getInt("OVERRIDE_THEME_RES_ID");
        L.r(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f14038g = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        L.r(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f14040i = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f14041j = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.l = bundle.getInt("INPUT_MODE_KEY");
        this.m = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14043n = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f14044o = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14045p = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f14046q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f14047r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f14048s = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f14049t = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f14041j;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f14040i);
        }
        this.f14054y = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f14055z = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i9 = this.f14036d;
        if (i9 != 0) {
            Dialog dialog = new Dialog(requireContext, i9);
            Context context = dialog.getContext();
            this.f14042k = e(context, android.R.attr.windowFullscreen);
            this.f14052w = new R3.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2861a.l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f14052w.i(context);
            this.f14052w.k(ColorStateList.valueOf(color));
            this.f14052w.j(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
            return dialog;
        }
        c();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i9;
        String string;
        if (this.f14042k) {
            i9 = R.layout.mtrl_picker_fullscreen;
        } else {
            i9 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i9, viewGroup);
        Context context = inflate.getContext();
        if (this.f14042k) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(d(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(d(context), -1));
        }
        ViewCompat.setAccessibilityLiveRegion((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text), 1);
        this.f14051v = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f14050u = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f14051v.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f14051v;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, com.facebook.appevents.n.g(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z8 = false;
        stateListDrawable.addState(new int[0], com.facebook.appevents.n.g(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f14051v;
        if (this.l != 0) {
            z8 = true;
        }
        checkableImageButton2.setChecked(z8);
        ViewCompat.setAccessibilityDelegate(this.f14051v, null);
        CheckableImageButton checkableImageButton3 = this.f14051v;
        if (this.l == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f14051v.setContentDescription(string);
        this.f14051v.setOnClickListener(new A6.c(this, 10));
        c();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f14035c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        m mVar;
        m b;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f14036d);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f14038g;
        ?? obj = new Object();
        int i9 = a.b;
        int i10 = a.b;
        long j7 = bVar.b.f14062h;
        long j9 = bVar.f14010c.f14062h;
        obj.f14009a = Long.valueOf(bVar.f14012f.f14062h);
        j jVar = this.f14039h;
        if (jVar == null) {
            mVar = null;
        } else {
            mVar = jVar.f14028f;
        }
        if (mVar != null) {
            obj.f14009a = Long.valueOf(mVar.f14062h);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f14011d);
        m b8 = m.b(j7);
        m b9 = m.b(j9);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.f14009a;
        if (l == null) {
            b = null;
        } else {
            b = m.b(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b8, b9, dVar, b, bVar.f14013g));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f14040i);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f14041j);
        bundle.putInt("INPUT_MODE_KEY", this.l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f14043n);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14044o);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f14045p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f14046q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f14047r);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f14048s);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f14049t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z8;
        int i9;
        boolean z9;
        H0 h02;
        H0 h03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f14042k) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f14052w);
            if (!this.f14053x) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList n2 = F2.h.n(findViewById.getBackground());
                if (n2 != null) {
                    num = Integer.valueOf(n2.getDefaultColor());
                } else {
                    num = null;
                }
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                if (num != null && num.intValue() != 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                int p2 = C0219j.p(window.getContext(), android.R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
                if (z8) {
                    num = Integer.valueOf(p2);
                }
                com.bumptech.glide.c.S(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i10 < 27) {
                    i9 = L.c.d(C0219j.p(context, android.R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
                } else {
                    i9 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i9);
                boolean s5 = C0219j.s(num.intValue());
                if (!C0219j.s(0) && !s5) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                E1.c cVar = new E1.c(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    insetsController2 = window.getInsetsController();
                    K0 k02 = new K0(insetsController2, cVar);
                    k02.f2868n = window;
                    h02 = k02;
                } else if (i11 >= 26) {
                    h02 = new H0(window, cVar);
                } else {
                    h02 = new H0(window, cVar);
                }
                h02.V(z9);
                boolean s9 = C0219j.s(p2);
                if (C0219j.s(i9) || (i9 == 0 && s9)) {
                    z10 = true;
                }
                E1.c cVar2 = new E1.c(window.getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    insetsController = window.getInsetsController();
                    K0 k03 = new K0(insetsController, cVar2);
                    k03.f2868n = window;
                    h03 = k03;
                } else if (i12 >= 26) {
                    h03 = new H0(window, cVar2);
                } else {
                    h03 = new H0(window, cVar2);
                }
                h03.U(z10);
                ViewCompat.setOnApplyWindowInsetsListener(findViewById, new E.g(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop()));
                this.f14053x = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f14052w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new H3.a(requireDialog(), rect));
        }
        requireContext();
        int i13 = this.f14036d;
        if (i13 != 0) {
            c();
            b bVar = this.f14038g;
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i13);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f14012f);
            jVar.setArguments(bundle);
            this.f14039h = jVar;
            r rVar = jVar;
            if (this.l == 1) {
                c();
                b bVar2 = this.f14038g;
                r lVar = new l();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i13);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                lVar.setArguments(bundle2);
                rVar = lVar;
            }
            this.f14037f = rVar;
            TextView textView = this.f14050u;
            if (this.l == 1 && getResources().getConfiguration().orientation == 2) {
                charSequence = this.f14055z;
            } else {
                charSequence = this.f14054y;
            }
            textView.setText(charSequence);
            c();
            getContext();
            throw null;
        }
        c();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f14037f.b.clear();
        super.onStop();
    }
}
