//Game by Kaylah
// No internet game
let block = document.getElementById('block');
let character = document.getElementById('character');
let game = document.getElementById('#game');
let gameOver = false;
// Game working

function jump(){
    let start = Date.now();
    var jumpInterval = setInterval(function(){

              let timePassed = Date.now() - start;
              if(timePassed > 500) {
                  character.style.top = '235px';
                  clearInterval(jumpInterval);
                  return;
              }

              character.style.top = (characterTop-80)+"px";

    },50);
}

document.addEventListener('keyup', event => {
  if (event.code === 'Space' && !gameOver) {
    jump();
  }

});

document.addEventListener('keydown', event => {
    if(event.code === 'KeyQ' && gameOver) {
      const banner = document.getElementById('game-over');
      banner.style.visibility = 'hidden';
      gameOver = false;
    }
})
