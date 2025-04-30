package com.mbridge.msdk.foundation.download;

/* loaded from: classes3.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int i9) {
        this.resourceType = i9;
    }

    public static DownloadResourceType getDownloadResourceType(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                return null;
                            }
                            return DOWNLOAD_RESOURCE_TYPE_APK;
                        }
                        return DOWNLOAD_RESOURCE_TYPE_OTHER;
                    }
                    return DOWNLOAD_RESOURCE_TYPE_HTML;
                }
                return DOWNLOAD_RESOURCE_TYPE_IMAGE;
            }
            return DOWNLOAD_RESOURCE_TYPE_ZIP;
        }
        return DOWNLOAD_RESOURCE_TYPE_VIDEO;
    }
}
