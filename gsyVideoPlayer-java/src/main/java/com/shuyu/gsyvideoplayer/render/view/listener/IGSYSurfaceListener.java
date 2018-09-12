package com.shuyu.gsyvideoplayer.render.view.listener;

import android.view.Surface;

/**
 * Surface 状态变化回调
 * Created by guoshuyu on 2018/1/29.
 */

public interface IGSYSurfaceListener {
    /**
     * 在SurfaceTexture准备使用时调用
     * @param surface Surface
     */
    void onSurfaceAvailable(Surface surface);

    /**
     * 当SurfaceTexture缓冲区大小更改时调用。
     * @param surface surface
     * @param width width
     * @param height height
     */
    void onSurfaceSizeChanged(Surface surface, int width, int height);

    /**
     * 当指定SurfaceTexture即将被销毁时调用。
     *
     * @param surface Surface
     * @return 如果返回true，则调用此方法后，表面纹理中不会发生渲染。 如果返回false，则客户端需要调用release()。大多数应用程序应该返回true。
     */
    boolean onSurfaceDestroyed(Surface surface);

    /**
     * 当指定SurfaceTexture的更新时调用
     * @param surface Surface
     */
    void onSurfaceUpdated(Surface surface);
}
