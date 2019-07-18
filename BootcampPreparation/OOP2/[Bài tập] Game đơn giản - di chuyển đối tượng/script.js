/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, size) {
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = size;
  this.speed;

  this.setSpeed = function (speed) {
    this.speed = speed;
  }
  this.getSpeed = function () {
    return this.setSpeed;
  }
  this.getHeroElement = function () {
    return '<img width="' + this.size + '"' +
      ' height="' + this.size + '"' +
      ' src="' + this.image + '"' +
      ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
  }

  this.moveRight = function () {
    this.left += this.speed;
    console.log('ok: ' + this.left);
  }

  this.moveDown = function () {
    this.top += this.speed;
    console.log('Top: ' + this.top);
  }

  this.moveLeft = function () {
    this.left = this.left - this.speed;
    console.log('left: ' + this.left);
  }

  this.moveTop = function () {
    this.top = this.top - this.speed;
    console.log('left: ' + this.left);
  }

}

var hero = new Hero('jerry.png', 0,0, 200);
hero.setSpeed(100);
function start() {
  if ((hero.left < window.innerWidth - hero.size)&&(hero.top==0)) {
    hero.moveRight();
  } else {
    if ((hero.top < window.innerHeight - hero.size)&&((hero.left >= window.innerWidth - hero.size))) {
      hero.moveDown();
    } else {
      if (hero.left > 0 ) {
        hero.moveLeft();
      }else 
      {
        hero.moveTop();
      }
    }
  }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 500)

}

start();