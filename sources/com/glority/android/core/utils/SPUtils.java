package com.glority.android.core.utils;

import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SPUtils.kt */
@Deprecated(message = "will use [PersistData] later")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u0002H\u0010¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0001J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/core/utils/SPUtils;", "", "()V", "FILE_NAME", "", "editor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "contain", "", "key", "(Ljava/lang/String;)Ljava/lang/Boolean;", LogEvents.exportemptyalert_close_click_type_get, ExifInterface.GPS_DIRECTION_TRUE, "defaultObject", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "remove", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SPUtils {
    private static final String FILE_NAME = "com.glority.framework";
    public static final SPUtils INSTANCE = new SPUtils();
    private static final SharedPreferences.Editor editor;
    private static final SharedPreferences sharedPreferences;

    private SPUtils() {
    }

    static {
        SharedPreferences sharedPreferences2 = AppContext.INSTANCE.peekContext().getSharedPreferences(FILE_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "AppContext.peekContext()…ME, Context.MODE_PRIVATE)");
        sharedPreferences = sharedPreferences2;
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "sharedPreferences.edit()");
        editor = edit;
    }

    public final void put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, ((Number) value).intValue());
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, ((Boolean) value).booleanValue());
        } else if (value instanceof Float) {
            editor.putFloat(key, ((Number) value).floatValue());
        } else if (value instanceof Long) {
            editor.putLong(key, ((Number) value).longValue());
        } else {
            editor.putString(key, value.toString());
        }
        editor.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T get(String key, T defaultObject) {
        Intrinsics.checkNotNullParameter(key, "key");
        return defaultObject instanceof String ? (T) sharedPreferences.getString(key, (String) defaultObject) : defaultObject instanceof Integer ? (T) Integer.valueOf(sharedPreferences.getInt(key, ((Number) defaultObject).intValue())) : defaultObject instanceof Boolean ? (T) Boolean.valueOf(sharedPreferences.getBoolean(key, ((Boolean) defaultObject).booleanValue())) : defaultObject instanceof Float ? (T) Float.valueOf(sharedPreferences.getFloat(key, ((Number) defaultObject).floatValue())) : defaultObject instanceof Long ? (T) Long.valueOf(sharedPreferences.getLong(key, ((Number) defaultObject).longValue())) : (T) sharedPreferences.getString(key, null);
    }

    public final void remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editor2 = editor;
        editor2.remove(key);
        editor2.commit();
    }

    public final void clear() {
        SharedPreferences.Editor editor2 = editor;
        editor2.clear();
        editor2.commit();
    }

    public final Boolean contain(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.valueOf(sharedPreferences.contains(key));
    }
}
