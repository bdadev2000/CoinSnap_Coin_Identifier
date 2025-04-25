package com.amazonaws.services.s3.internal;

import com.amazonaws.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class XmlWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    List<String> tags = new ArrayList();
    StringBuilder sb = new StringBuilder();

    public XmlWriter start(String str) {
        this.sb.append("<").append(str).append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String str2, String str3) {
        this.sb.append("<").append(str);
        writeAttr(str2, str3);
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter start(String str, String[] strArr, String[] strArr2) {
        this.sb.append("<").append(str);
        for (int i = 0; i < Math.min(strArr.length, strArr2.length); i++) {
            writeAttr(strArr[i], strArr2[i]);
        }
        this.sb.append(">");
        this.tags.add(str);
        return this;
    }

    public XmlWriter end() {
        this.sb.append("</").append(this.tags.remove(r0.size() - 1)).append(">");
        return this;
    }

    public byte[] getBytes() {
        return toString().getBytes(StringUtils.UTF8);
    }

    public String toString() {
        return this.sb.toString();
    }

    public XmlWriter value(String str) {
        appendEscapedString(str, this.sb);
        return this;
    }

    private void writeAttr(String str, String str2) {
        this.sb.append(' ').append(str).append("=\"");
        appendEscapedString(str2, this.sb);
        this.sb.append("\"");
    }

    private void appendEscapedString(String str, StringBuilder sb) {
        String str2;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                str2 = "&#9;";
            } else if (charAt == '\n') {
                str2 = "&#10;";
            } else if (charAt == '\r') {
                str2 = "&#13;";
            } else if (charAt == '\"') {
                str2 = "&quot;";
            } else if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt == '<') {
                str2 = "&lt;";
            } else {
                str2 = charAt != '>' ? null : "&gt;";
            }
            if (str2 != null) {
                if (i2 < i) {
                    sb.append((CharSequence) str, i2, i);
                }
                this.sb.append(str2);
                i2 = i + 1;
            }
            i++;
        }
        if (i2 < i) {
            this.sb.append((CharSequence) str, i2, i);
        }
    }
}
