package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class t6 extends yb {

    /* renamed from: n, reason: collision with root package name */
    private final u6 f11304n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f11305o;

    public t6(u6 u6Var, Context context) {
        super(yb.c.DETAIL);
        this.f11304n = u6Var;
        this.f11305o = context;
        this.f12370c = r();
        this.f12371d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + zp.a(this.f11304n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f11304n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f11304n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.yb
    public int d() {
        if (o()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.h();
    }

    @Override // com.applovin.impl.yb
    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.f11305o);
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return true;
    }
}
