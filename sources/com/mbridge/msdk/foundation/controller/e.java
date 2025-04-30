package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private String f15424a;

    /* renamed from: e, reason: collision with root package name */
    private int f15427e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15429g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15430h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15431i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15432j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15433k;
    private a l;
    private final SharedPreferences m;
    private String b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f15425c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f15426d = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f15428f = false;

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public e(Context context) {
        this.f15424a = "";
        this.f15427e = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (defaultSharedPreferences != null) {
            this.f15424a = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.f15427e = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            a(defaultSharedPreferences.getString("IABTCF_PurposeConsents", ""));
            b(defaultSharedPreferences.getString("IABTCF_VendorConsents", ""));
            c(defaultSharedPreferences.getString("IABTCF_AddtlConsent", ""));
        }
    }

    private void b(String str) {
        this.f15431i = a(str, 867);
        this.f15425c = str;
    }

    private void c(String str) {
        this.f15426d = str;
        if (TextUtils.isEmpty(str)) {
            this.f15432j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f15433k = false;
            return;
        }
        this.f15433k = true;
        try {
            String[] split = str.split("~");
            if (split.length > 1) {
                if (TextUtils.isEmpty(split[1])) {
                    this.f15432j = false;
                } else {
                    this.f15432j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }

    private boolean d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.matches("[01]+");
        }
        return false;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.l = aVar;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c9;
        try {
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 != 0) {
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                if (c9 == 4) {
                                    c(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                                }
                            } else {
                                b(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                            }
                        } else {
                            a(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        }
                    } else {
                        this.f15427e = sharedPreferences.getInt("IABTCF_gdprApplies", 0);
                    }
                } else {
                    this.f15424a = sharedPreferences.getString("IABTCF_TCString", "");
                }
                a aVar = this.l;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }

    public final String a() {
        return this.f15424a;
    }

    private void a(String str) {
        this.f15429g = a(str, 1);
        this.f15430h = a(str, 2);
        this.b = str;
    }

    public final boolean b() {
        if (this.f15427e == 0) {
            this.f15428f = true;
            return true;
        }
        if (d(this.b) && d(this.f15425c)) {
            if (MBridgeConstans.VERIFY_ATP_CONSENT) {
                this.f15428f = (this.f15431i || (this.f15433k && this.f15432j)) && this.f15429g && this.f15430h;
                return this.f15428f;
            }
            if (!this.f15431i || !this.f15429g || !this.f15430h) {
                r1 = false;
            }
        }
        this.f15428f = r1;
        return this.f15428f;
    }

    private boolean a(String str, int i9) {
        return d(str) && i9 <= str.length() && i9 >= 1 && '1' == str.charAt(i9 - 1);
    }
}
