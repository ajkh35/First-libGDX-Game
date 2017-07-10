package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	OrthographicCamera mCamera;
	ExtendViewport mViewport;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("images.jpg");
		mCamera = new OrthographicCamera();
		mViewport = new ExtendViewport(Constants.SCREEN_HEIGHT,Constants.SCREEN_WIDTH,mCamera);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.57f, 0.77f, 0.85f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 188, 115);
		batch.end();
	}
	
	@Override
	public void resize(int width,int height){
		mViewport.update(width, height, true);
	    batch.setProjectionMatrix(mCamera.combined);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
