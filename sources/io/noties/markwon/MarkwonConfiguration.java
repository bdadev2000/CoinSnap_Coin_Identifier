package io.noties.markwon;

import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.ImageSizeResolver;
import io.noties.markwon.image.ImageSizeResolverDef;
import io.noties.markwon.syntax.SyntaxHighlight;
import io.noties.markwon.syntax.SyntaxHighlightNoOp;
import io.noties.markwon.urlprocessor.UrlProcessor;
import io.noties.markwon.urlprocessor.UrlProcessorNoOp;

/* loaded from: classes5.dex */
public class MarkwonConfiguration {
    private final AsyncDrawableLoader asyncDrawableLoader;
    private final ImageSizeResolver imageSizeResolver;
    private final LinkResolver linkResolver;
    private final MarkwonSpansFactory spansFactory;
    private final SyntaxHighlight syntaxHighlight;
    private final MarkwonTheme theme;
    private final UrlProcessor urlProcessor;

    public static Builder builder() {
        return new Builder();
    }

    private MarkwonConfiguration(Builder builder) {
        this.theme = builder.theme;
        this.asyncDrawableLoader = builder.asyncDrawableLoader;
        this.syntaxHighlight = builder.syntaxHighlight;
        this.linkResolver = builder.linkResolver;
        this.urlProcessor = builder.urlProcessor;
        this.imageSizeResolver = builder.imageSizeResolver;
        this.spansFactory = builder.spansFactory;
    }

    public MarkwonTheme theme() {
        return this.theme;
    }

    public AsyncDrawableLoader asyncDrawableLoader() {
        return this.asyncDrawableLoader;
    }

    public SyntaxHighlight syntaxHighlight() {
        return this.syntaxHighlight;
    }

    public LinkResolver linkResolver() {
        return this.linkResolver;
    }

    public UrlProcessor urlProcessor() {
        return this.urlProcessor;
    }

    public ImageSizeResolver imageSizeResolver() {
        return this.imageSizeResolver;
    }

    public MarkwonSpansFactory spansFactory() {
        return this.spansFactory;
    }

    /* loaded from: classes5.dex */
    public static class Builder {
        private AsyncDrawableLoader asyncDrawableLoader;
        private ImageSizeResolver imageSizeResolver;
        private LinkResolver linkResolver;
        private MarkwonSpansFactory spansFactory;
        private SyntaxHighlight syntaxHighlight;
        private MarkwonTheme theme;
        private UrlProcessor urlProcessor;

        public Builder asyncDrawableLoader(AsyncDrawableLoader asyncDrawableLoader) {
            this.asyncDrawableLoader = asyncDrawableLoader;
            return this;
        }

        public Builder syntaxHighlight(SyntaxHighlight syntaxHighlight) {
            this.syntaxHighlight = syntaxHighlight;
            return this;
        }

        public Builder linkResolver(LinkResolver linkResolver) {
            this.linkResolver = linkResolver;
            return this;
        }

        public Builder urlProcessor(UrlProcessor urlProcessor) {
            this.urlProcessor = urlProcessor;
            return this;
        }

        public Builder imageSizeResolver(ImageSizeResolver imageSizeResolver) {
            this.imageSizeResolver = imageSizeResolver;
            return this;
        }

        public MarkwonConfiguration build(MarkwonTheme markwonTheme, MarkwonSpansFactory markwonSpansFactory) {
            this.theme = markwonTheme;
            this.spansFactory = markwonSpansFactory;
            if (this.asyncDrawableLoader == null) {
                this.asyncDrawableLoader = AsyncDrawableLoader.noOp();
            }
            if (this.syntaxHighlight == null) {
                this.syntaxHighlight = new SyntaxHighlightNoOp();
            }
            if (this.linkResolver == null) {
                this.linkResolver = new LinkResolverDef();
            }
            if (this.urlProcessor == null) {
                this.urlProcessor = new UrlProcessorNoOp();
            }
            if (this.imageSizeResolver == null) {
                this.imageSizeResolver = new ImageSizeResolverDef();
            }
            return new MarkwonConfiguration(this);
        }
    }
}
