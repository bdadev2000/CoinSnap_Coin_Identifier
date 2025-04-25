package com.glority.base.manager;

import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes6.dex */
public class MediaStoreFactory {
    private static MediaStoreFactory instance;

    public static MediaStoreFactory getInstance() {
        if (instance == null) {
            synchronized (MediaStoreFactory.class) {
                if (instance == null) {
                    instance = new MediaStoreFactory();
                }
            }
        }
        return instance;
    }

    public Uri createURI(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 93166550:
                if (str.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                    c = 0;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c = 1;
                    break;
                }
                break;
            case 112202875:
                if (str.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            case 1:
                return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            case 2:
                return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            default:
                return null;
        }
    }
}
