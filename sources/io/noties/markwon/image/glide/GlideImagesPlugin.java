package io.noties.markwon.image.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.MarkwonSpansFactory;
import io.noties.markwon.image.AsyncDrawable;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.AsyncDrawableScheduler;
import io.noties.markwon.image.DrawableUtils;
import io.noties.markwon.image.ImageSpanFactory;
import java.util.HashMap;
import java.util.Map;
import org.commonmark.node.Image;

/* loaded from: classes5.dex */
public class GlideImagesPlugin extends AbstractMarkwonPlugin {
    private final GlideAsyncDrawableLoader glideAsyncDrawableLoader;

    /* loaded from: classes5.dex */
    public interface GlideStore {
        void cancel(Target<?> target);

        RequestBuilder<Drawable> load(AsyncDrawable asyncDrawable);
    }

    public static GlideImagesPlugin create(final Context context) {
        return create(new GlideStore() { // from class: io.noties.markwon.image.glide.GlideImagesPlugin.1
            @Override // io.noties.markwon.image.glide.GlideImagesPlugin.GlideStore
            public RequestBuilder<Drawable> load(AsyncDrawable asyncDrawable) {
                return Glide.with(context).load(asyncDrawable.getDestination());
            }

            @Override // io.noties.markwon.image.glide.GlideImagesPlugin.GlideStore
            public void cancel(Target<?> target) {
                Glide.with(context).clear(target);
            }
        });
    }

    public static GlideImagesPlugin create(final RequestManager requestManager) {
        return create(new GlideStore() { // from class: io.noties.markwon.image.glide.GlideImagesPlugin.2
            @Override // io.noties.markwon.image.glide.GlideImagesPlugin.GlideStore
            public RequestBuilder<Drawable> load(AsyncDrawable asyncDrawable) {
                return RequestManager.this.load(asyncDrawable.getDestination());
            }

            @Override // io.noties.markwon.image.glide.GlideImagesPlugin.GlideStore
            public void cancel(Target<?> target) {
                RequestManager.this.clear(target);
            }
        });
    }

    public static GlideImagesPlugin create(GlideStore glideStore) {
        return new GlideImagesPlugin(glideStore);
    }

    GlideImagesPlugin(GlideStore glideStore) {
        this.glideAsyncDrawableLoader = new GlideAsyncDrawableLoader(glideStore);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureSpansFactory(MarkwonSpansFactory.Builder builder) {
        builder.setFactory(Image.class, new ImageSpanFactory());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        builder.asyncDrawableLoader(this.glideAsyncDrawableLoader);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void beforeSetText(TextView textView, Spanned spanned) {
        AsyncDrawableScheduler.unschedule(textView);
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void afterSetText(TextView textView) {
        AsyncDrawableScheduler.schedule(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class GlideAsyncDrawableLoader extends AsyncDrawableLoader {
        private final Map<AsyncDrawable, Target<?>> cache = new HashMap(2);
        private final GlideStore glideStore;

        @Override // io.noties.markwon.image.AsyncDrawableLoader
        public Drawable placeholder(AsyncDrawable asyncDrawable) {
            return null;
        }

        GlideAsyncDrawableLoader(GlideStore glideStore) {
            this.glideStore = glideStore;
        }

        @Override // io.noties.markwon.image.AsyncDrawableLoader
        public void load(AsyncDrawable asyncDrawable) {
            AsyncDrawableTarget asyncDrawableTarget = new AsyncDrawableTarget(asyncDrawable);
            this.cache.put(asyncDrawable, asyncDrawableTarget);
            this.glideStore.load(asyncDrawable).into((RequestBuilder<Drawable>) asyncDrawableTarget);
        }

        @Override // io.noties.markwon.image.AsyncDrawableLoader
        public void cancel(AsyncDrawable asyncDrawable) {
            Target<?> remove = this.cache.remove(asyncDrawable);
            if (remove != null) {
                this.glideStore.cancel(remove);
            }
        }

        /* loaded from: classes5.dex */
        private class AsyncDrawableTarget extends CustomTarget<Drawable> {
            private final AsyncDrawable drawable;

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
            }

            AsyncDrawableTarget(AsyncDrawable asyncDrawable) {
                this.drawable = asyncDrawable;
            }

            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                if (GlideAsyncDrawableLoader.this.cache.remove(this.drawable) == null || !this.drawable.isAttached()) {
                    return;
                }
                DrawableUtils.applyIntrinsicBoundsIfEmpty(drawable);
                this.drawable.setResult(drawable);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadStarted(Drawable drawable) {
                if (drawable == null || !this.drawable.isAttached()) {
                    return;
                }
                DrawableUtils.applyIntrinsicBoundsIfEmpty(drawable);
                this.drawable.setResult(drawable);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                if (GlideAsyncDrawableLoader.this.cache.remove(this.drawable) == null || drawable == null || !this.drawable.isAttached()) {
                    return;
                }
                DrawableUtils.applyIntrinsicBoundsIfEmpty(drawable);
                this.drawable.setResult(drawable);
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                if (this.drawable.isAttached()) {
                    this.drawable.clearResult();
                }
            }
        }
    }
}
