package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.dc;
import com.applovin.sdk.R;

/* loaded from: classes2.dex */
public class v6 extends dc {

    /* renamed from: n, reason: collision with root package name */
    private final w6 f27472n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f27473o;

    public v6(w6 w6Var, Context context) {
        super(dc.c.DETAIL);
        this.f27472n = w6Var;
        this.f27473o = context;
        this.f23448c = r();
        this.d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + yp.a(this.f27472n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f27472n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f27472n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.dc
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.dc
    public int e() {
        return t3.a(R.color.applovin_sdk_disclosureButtonColor, this.f27473o);
    }

    @Override // com.applovin.impl.dc
    public boolean o() {
        return true;
    }
}
