package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface zp {
    int zp(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr);

    int zp(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr);

    Cursor zp(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2);

    Uri zp(@NonNull Uri uri, @Nullable ContentValues contentValues);

    @NonNull
    String zp();

    String zp(@NonNull Uri uri);
}
