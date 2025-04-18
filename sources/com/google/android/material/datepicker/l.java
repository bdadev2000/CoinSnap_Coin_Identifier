package com.google.android.material.datepicker;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.plantcare.ai.identifier.plantid.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n0.w2;
import v8.u0;

/* loaded from: classes3.dex */
public final class l<S> extends androidx.fragment.app.r {
    public static final /* synthetic */ int A = 0;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f11698b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11699c;

    /* renamed from: d, reason: collision with root package name */
    public int f11700d;

    /* renamed from: f, reason: collision with root package name */
    public s f11701f;

    /* renamed from: g, reason: collision with root package name */
    public c f11702g;

    /* renamed from: h, reason: collision with root package name */
    public k f11703h;

    /* renamed from: i, reason: collision with root package name */
    public int f11704i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f11705j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11706k;

    /* renamed from: l, reason: collision with root package name */
    public int f11707l;

    /* renamed from: m, reason: collision with root package name */
    public int f11708m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f11709n;

    /* renamed from: o, reason: collision with root package name */
    public int f11710o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f11711p;

    /* renamed from: q, reason: collision with root package name */
    public int f11712q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f11713r;

    /* renamed from: s, reason: collision with root package name */
    public int f11714s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f11715t;
    public TextView u;

    /* renamed from: v, reason: collision with root package name */
    public CheckableImageButton f11716v;

    /* renamed from: w, reason: collision with root package name */
    public ka.i f11717w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11718x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f11719y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f11720z;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f11698b = new LinkedHashSet();
        this.f11699c = new LinkedHashSet();
    }

    public static int e(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        n nVar = new n(u.c());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = nVar.f11726f;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean f(Context context) {
        return g(context, android.R.attr.windowFullscreen);
    }

    public static boolean g(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c6.k.y(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final void c() {
        com.applovin.impl.mediation.ads.e.n(getArguments().getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11698b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11700d = bundle.getInt("OVERRIDE_THEME_RES_ID");
        com.applovin.impl.mediation.ads.e.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11702g = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        com.applovin.impl.mediation.ads.e.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11704i = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11705j = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f11707l = bundle.getInt("INPUT_MODE_KEY");
        this.f11708m = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11709n = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f11710o = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f11711p = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f11712q = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11713r = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f11714s = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f11715t = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f11705j;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f11704i);
        }
        this.f11719y = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f11720z = charSequence;
    }

    @Override // androidx.fragment.app.r
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i10 = this.f11700d;
        if (i10 != 0) {
            Dialog dialog = new Dialog(requireContext, i10);
            Context context = dialog.getContext();
            this.f11706k = f(context);
            this.f11717w = new ka.i(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, r9.a.f24030l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f11717w.h(context);
            this.f11717w.k(ColorStateList.valueOf(color));
            this.f11717w.j(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
            return dialog;
        }
        c();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        String string;
        if (this.f11706k) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.f11706k) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(e(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(e(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f11716v = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.u = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f11716v.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f11716v;
        StateListDrawable stateListDrawable = new StateListDrawable();
        boolean z10 = false;
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, com.bumptech.glide.c.t(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], com.bumptech.glide.c.t(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f11716v;
        if (this.f11707l != 0) {
            z10 = true;
        }
        checkableImageButton2.setChecked(z10);
        ViewCompat.setAccessibilityDelegate(this.f11716v, null);
        CheckableImageButton checkableImageButton3 = this.f11716v;
        if (this.f11707l == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f11716v.setContentDescription(string);
        this.f11716v.setOnClickListener(new z2.b(this, 4));
        c();
        throw null;
    }

    @Override // androidx.fragment.app.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11699c.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        n nVar;
        n b3;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11700d);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a aVar = new a(this.f11702g);
        k kVar = this.f11703h;
        if (kVar == null) {
            nVar = null;
        } else {
            nVar = kVar.f11689f;
        }
        if (nVar != null) {
            aVar.f11663c = Long.valueOf(nVar.f11728h);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", aVar.f11665e);
        n b10 = n.b(aVar.a);
        n b11 = n.b(aVar.f11662b);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f11663c;
        if (l10 == null) {
            b3 = null;
        } else {
            b3 = n.b(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(b10, b11, bVar, b3, aVar.f11664d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11704i);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11705j);
        bundle.putInt("INPUT_MODE_KEY", this.f11707l);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f11708m);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f11709n);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f11710o);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f11711p);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f11712q);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f11713r);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f11714s);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f11715t);
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onStart() {
        CharSequence charSequence;
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        super.onStart();
        Window window = requireDialog().getWindow();
        boolean z13 = false;
        if (this.f11706k) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11717w);
            if (!this.f11718x) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList n10 = c6.k.n(findViewById.getBackground());
                if (n10 != null) {
                    num = Integer.valueOf(n10.getDefaultColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int y4 = u0.y(window.getContext(), android.R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
                if (z10) {
                    num = Integer.valueOf(y4);
                }
                Integer valueOf = Integer.valueOf(y4);
                com.bumptech.glide.e.R(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = g0.d.c(u0.y(context, android.R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean I = u0.I(num.intValue());
                if (!u0.I(0) && !I) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                new w2(window, window.getDecorView()).a.s(z11);
                boolean I2 = u0.I(valueOf.intValue());
                if (!u0.I(i10) && (i10 != 0 || !I2)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                new w2(window, window.getDecorView()).a.r(z12);
                ViewCompat.setOnApplyWindowInsetsListener(findViewById, new androidx.activity.result.i(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
                this.f11718x = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f11717w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new aa.a(requireDialog(), rect));
        }
        requireContext();
        int i12 = this.f11700d;
        if (i12 != 0) {
            c();
            c cVar = this.f11702g;
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i12);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f11669f);
            kVar.setArguments(bundle);
            this.f11703h = kVar;
            s sVar = kVar;
            if (this.f11707l == 1) {
                c();
                c cVar2 = this.f11702g;
                s mVar = new m();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i12);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
                mVar.setArguments(bundle2);
                sVar = mVar;
            }
            this.f11701f = sVar;
            TextView textView = this.u;
            if (this.f11707l == 1) {
                if (getResources().getConfiguration().orientation == 2) {
                    z13 = true;
                }
                if (z13) {
                    charSequence = this.f11720z;
                    textView.setText(charSequence);
                    c();
                    getContext();
                    throw null;
                }
            }
            charSequence = this.f11719y;
            textView.setText(charSequence);
            c();
            getContext();
            throw null;
        }
        c();
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f11701f.f11742b.clear();
        super.onStop();
    }
}
