package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class PrefetchVastAdTagUri extends VastAdTagUri {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29496b = "PrefetchVastAdTagUri";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29497c = "\\[[\\s\\S].*?\\]";
    private final String[] d;

    public PrefetchVastAdTagUri(String uri) {
        super(uri);
        this.d = a(uri);
        Logger.d(f29496b, "Prefetch URI, unique parts: " + Arrays.toString(this.d));
    }

    private String[] a(String str) {
        return str != null ? str.split(f29497c) : new String[0];
    }

    private boolean b(String str) {
        int indexOf;
        for (String str2 : this.d) {
            if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(str2)) < 0) {
                return false;
            }
            str = str.substring(str2.length() + indexOf);
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.VastAdTagUri
    public boolean equals(Object obj) {
        return b(obj.toString());
    }
}
