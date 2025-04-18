package androidx.datastore.core;

import androidx.datastore.preferences.core.MutablePreferences;
import java.io.FileInputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface Serializer<T> {
    MutablePreferences a();

    MutablePreferences b(FileInputStream fileInputStream);

    void c(Object obj, OutputStream outputStream);
}
