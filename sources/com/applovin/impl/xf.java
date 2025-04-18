package com.applovin.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class xf extends yb {

    /* renamed from: n, reason: collision with root package name */
    private final fe f8973n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f8974o;

    public xf(fe feVar, Context context) {
        super(yb.c.DETAIL);
        this.f8973n = feVar;
        this.f8974o = context;
        this.f9168c = t();
        this.f9169d = s();
    }

    private SpannedString q() {
        if (this.f8973n.y()) {
            if (!TextUtils.isEmpty(this.f8973n.c())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8973n.c(), ViewCompat.MEASURED_STATE_MASK));
                if (this.f8973n.z()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(255, 127, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8973n.k(), ViewCompat.MEASURED_STATE_MASK));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f8973n.q() == fe.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        int i10;
        if (o()) {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i10 = -7829368;
        }
        return StringUtils.createSpannedString(this.f8973n.g(), i10, 18, 1);
    }

    private SpannedString u() {
        String str;
        if (this.f8973n.C()) {
            if (StringUtils.isValidString(this.f8973n.p())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8973n.p(), ViewCompat.MEASURED_STATE_MASK));
                return new SpannedString(spannableStringBuilder);
            }
            if (this.f8973n.y()) {
                str = "Retrieving SDK Version...";
            } else {
                str = "SDK Found";
            }
            return StringUtils.createListItemDetailSpannedString(str, ViewCompat.MEASURED_STATE_MASK);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    @Override // com.applovin.impl.yb
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.yb
    public int e() {
        return r3.a(R.color.applovin_sdk_disclosureButtonColor, this.f8974o);
    }

    @Override // com.applovin.impl.yb
    public int h() {
        int h10 = this.f8973n.h();
        if (h10 <= 0) {
            return R.drawable.applovin_ic_mediation_placeholder;
        }
        return h10;
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return this.f8973n.q() != fe.a.MISSING;
    }

    public fe r() {
        return this.f8973n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f9168c) + ", detailText=" + ((Object) this.f9169d) + ", network=" + this.f8973n + "}";
    }
}
