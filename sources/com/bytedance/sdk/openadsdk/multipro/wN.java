package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class wN implements YFl {
    private static WeakReference<Context> Sg;
    private static volatile wN YFl;
    private static final List<YFl> tN;

    static {
        List<YFl> synchronizedList = Collections.synchronizedList(new ArrayList());
        tN = synchronizedList;
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.AlY.tN());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.YFl.Sg());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.tN.YFl());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.AlY.YFl.wN(new com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg()));
        Iterator<YFl> it = synchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private wN() {
    }

    private YFl Sg(Uri uri) {
        if (uri == null || !tN(uri)) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (YFl yFl : tN) {
            if (str.equals(yFl.YFl())) {
                return yFl;
            }
        }
        return null;
    }

    private boolean tN(Uri uri) {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    @NonNull
    public String YFl() {
        return "";
    }

    public static wN YFl(Context context) {
        if (context != null) {
            Sg = new WeakReference<>(context.getApplicationContext());
        }
        if (YFl == null) {
            synchronized (wN.class) {
                if (YFl == null) {
                    YFl = new wN();
                }
            }
        }
        return YFl;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Cursor YFl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            YFl Sg2 = Sg(uri);
            if (Sg2 != null) {
                return Sg2.YFl(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl(@NonNull Uri uri) {
        try {
            YFl Sg2 = Sg(uri);
            if (Sg2 != null) {
                return Sg2.YFl(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Uri YFl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            YFl Sg2 = Sg(uri);
            if (Sg2 != null) {
                return Sg2.YFl(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            YFl Sg2 = Sg(uri);
            if (Sg2 != null) {
                return Sg2.YFl(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            YFl Sg2 = Sg(uri);
            if (Sg2 != null) {
                return Sg2.YFl(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
