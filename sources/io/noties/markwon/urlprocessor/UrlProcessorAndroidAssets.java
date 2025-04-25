package io.noties.markwon.urlprocessor;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public class UrlProcessorAndroidAssets implements UrlProcessor {
    static final String BASE = "file:///android_asset/";
    static final String MOCK = "https://android.asset/";
    private final UrlProcessorRelativeToAbsolute assetsProcessor;
    private final UrlProcessor processor;

    public UrlProcessorAndroidAssets() {
        this(null);
    }

    public UrlProcessorAndroidAssets(UrlProcessor urlProcessor) {
        this.assetsProcessor = new UrlProcessorRelativeToAbsolute(MOCK);
        this.processor = urlProcessor;
    }

    @Override // io.noties.markwon.urlprocessor.UrlProcessor
    public String process(String str) {
        if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
            return this.assetsProcessor.process(str).replace(MOCK, BASE);
        }
        UrlProcessor urlProcessor = this.processor;
        return urlProcessor != null ? urlProcessor.process(str) : str;
    }
}
