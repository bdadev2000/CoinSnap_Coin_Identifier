package com.mbridge.msdk.foundation.download;

/* loaded from: classes4.dex */
public enum DownloadResourceType {
    DOWNLOAD_RESOURCE_TYPE_VIDEO(0),
    DOWNLOAD_RESOURCE_TYPE_ZIP(1),
    DOWNLOAD_RESOURCE_TYPE_IMAGE(2),
    DOWNLOAD_RESOURCE_TYPE_HTML(3),
    DOWNLOAD_RESOURCE_TYPE_OTHER(4),
    DOWNLOAD_RESOURCE_TYPE_APK(5);

    public int resourceType;

    DownloadResourceType(int i10) {
        this.resourceType = i10;
    }

    public static DownloadResourceType getDownloadResourceType(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
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
