package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public final class FacebookInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        G7.j.e(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        G7.j.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        G7.j.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                com.facebook.r.j(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception e4) {
            Log.i("FacebookInitProvider", "Failed to auto initialize the Facebook SDK", e4);
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        G7.j.e(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        G7.j.e(uri, "uri");
        return 0;
    }
}
