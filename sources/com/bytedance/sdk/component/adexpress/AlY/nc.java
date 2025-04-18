package com.bytedance.sdk.component.adexpress.AlY;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class nc {

    /* loaded from: classes.dex */
    public enum YFl {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String wN;

        YFl(String str) {
            this.wN = str;
        }

        public String YFl() {
            return this.wN;
        }
    }

    public static boolean Sg(String str) {
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

    public static YFl YFl(String str) {
        YFl yFl = YFl.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        yFl = YFl.CSS;
                    } else if (path.endsWith(".js")) {
                        yFl = YFl.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        yFl = YFl.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return yFl;
    }
}
