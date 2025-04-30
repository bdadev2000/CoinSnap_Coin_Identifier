package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public interface m {
    ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
}
