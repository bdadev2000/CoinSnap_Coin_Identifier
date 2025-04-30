package com.bytedance.sdk.component.adexpress.jU;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class ku {

    /* loaded from: classes.dex */
    public enum zp {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String COT;

        zp(String str) {
            this.COT = str;
        }

        public String zp() {
            return this.COT;
        }
    }

    public static boolean lMd(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }

    public static zp zp(String str) {
        zp zpVar = zp.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        zpVar = zp.CSS;
                    } else if (path.endsWith(".js")) {
                        zpVar = zp.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        zpVar = zp.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return zpVar;
    }
}
